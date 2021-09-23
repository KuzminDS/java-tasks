package filters;

import services.StudentsService;

import javax.servlet.*;
import java.io.IOException;

public class ValidationFilter implements Filter {

    private StudentsService studentsService;

    @Override
    public void init(FilterConfig filterConfig) {
        studentsService = new StudentsService();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

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
        else if (studentsService.exists(name)) {
            errorMessage += "Student with specified name:" + name + " already exists.\n";
            SendMessage(request, response, errorMessage);
        }
        else if (Float.parseFloat(score) < 0 || Float.parseFloat(score) > 5){
            errorMessage += "Score must be from 0 to 5.\n";
            SendMessage(request, response, errorMessage);
        }
        else {
            chain.doFilter(request, response);
        }
    }

    private void SendMessage(ServletRequest request, ServletResponse response, String message) throws ServletException, IOException {
        request.setAttribute("errorMessage", message);
        request.getRequestDispatcher("validationError").include(request, response);
    }

    @Override
    public void destroy() { }
}
