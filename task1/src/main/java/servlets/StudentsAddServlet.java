package servlets;

import entities.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.StudentsService;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet("/add")
public class StudentsAddServlet extends HttpServlet {

    private StudentsService studentsService;

    public void init() {
        studentsService = new StudentsService();
    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String score = request.getParameter("averageScore");
        String blockchain = request.getParameter("isBlockchain");

        String errorMessage = "";
        if (name == null || "".equals(name)
                || score == null || "".equals(score)
                || blockchain == null || "".equals(blockchain)) {

            errorMessage += "One or several fields are empty.\n";
            SendMessage(request, response, errorMessage);
        }
        else if (!tryParseFloat(score)) {
            errorMessage += "Score field has wrong format.\n";
            SendMessage(request, response, errorMessage);
        }
        else if (studentsService.exists(name)) {
            errorMessage += "Student with specified name:" + name + " already exists.\n";
            SendMessage(request, response, errorMessage);
        }
        else if (Float.parseFloat(score) < 0 || Float.parseFloat(score) > 5){
            errorMessage += "Score must be from 0 to 5.\n";
        }
        SendMessage(request, response, errorMessage);

        Student student = new Student(name, Float.parseFloat(score), blockchain.equals("True"));
        studentsService.addStudent(student);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private boolean tryParseFloat(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    private void SendMessage(HttpServletRequest request, HttpServletResponse response, String message) throws ServletException, IOException {
        request.setAttribute("errorMessage", message);
        request.getRequestDispatcher("validationError.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("add.jsp").forward(request, response);
    }
}
