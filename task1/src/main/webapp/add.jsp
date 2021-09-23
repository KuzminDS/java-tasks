<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

<html>
<head>
    <title>Students</title>
</head>
<body>
    <form method="post">
        <label>
            Name:
            <input type="text" name="name"><br />
        </label>

        <label>
            Average score:
            <input type="number" step="any" name="averageScore"><br />
        </label>

        <label>
            Blockchain:
            <select name = "isBlockchain">
                <option>True</option>
                <option>False</option>
            </select>>
        </label>

        <button type="submit">Submit</button>
    </form>
</body>
</html>