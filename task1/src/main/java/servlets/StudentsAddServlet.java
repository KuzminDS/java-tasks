package servlets;

import entities.Student;
import services.StudentsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
