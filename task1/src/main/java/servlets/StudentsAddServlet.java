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

        Student student = new Student(name, Float.parseFloat(score), blockchain.equals("True"));
        studentsService.addStudent(student);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("add.jsp").forward(request, response);
    }
}
