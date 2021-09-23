package servlets;

import entities.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.StudentsService;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/excellent")
public class StudentsGetExcellentServlet extends HttpServlet {

    private StudentsService studentsService;

    public void init() {
        studentsService = new StudentsService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Student> students = studentsService.getExcellentStudents();
        request.setAttribute("students", students);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
