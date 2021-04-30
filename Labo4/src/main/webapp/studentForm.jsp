<%--
  Created by IntelliJ IDEA.
  User: dries
  Date: 07/03/2021
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>ADD STUDENT</title>
</head>
<body>
    <form method="POST" action="StudentInfo">
        <label for="naam">Naam: <input type="text" id="naam" name="naam" required></label><br><br>
        <label for="voornaam">Voornaam: <input type="text" id="voornaam" name="voornaam" required></label><br><br>
        <label for="leeftijd">Leeftijd: <input type="text" id="leeftijd" name="leeftijd" required></label><br><br>
        <label for="studierichting">Studierichting: <input type="text" id="studierichting" name="studierichting" required></label><br><br>
        <input type="submit" id="bewaar" value="add student">
    </form>
</body>
</html>
