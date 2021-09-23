<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="entities.Student" %>
<html>
<head>
    <title>Students</title>
</head>
    <body>
        <h2>Students</h2><br />

        <table>
          <tr>
            <th>Name</th>
            <th>Score</th>
            <th>Blockchain</th>
          </tr>
          <%
            List<Student> students = (List<Student>)request.getAttribute("students");

            for (Student s : students) {
                out.print("<tr>");
                out.print("<td>" + s.getName() + "<\td>");
                out.print("<td>" + s.getAverageScore() + "<\td>");
                out.print("<td>" + s.getIsBlockchain() + "<\td>");
                out.print("</tr>");
            }
          %>
        </table>

    </body>
</html>