<%--
  Created by IntelliJ IDEA.
  User: dries
  Date: 06/03/2021
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gevonden</title>
</head>
<body>
    <p>Je vroeg naar volgende gegevens: <%= request.getAttribute("resultMessage") %></p>
</body>
</html>
