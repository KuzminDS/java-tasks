<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

<!doctype html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Students</title>
    </head>
    <body>

        <h1>Students</h1>

        <table border="1" cellpadding="2" cellspacing="2">
            <tr>
                <th>Name</th>
                <th>Average score</th>
                <th>Blockchain</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.name}</td>
                    <td>${student.averageScore}</td>
                    <td>${student.isBlockchain}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>