<%--
  Created by IntelliJ IDEA.
  User: dries
  Date: 07/03/2021
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Zoek persoon</title>
</head>
<body>
    <form action="StudentInfo" method="GET">
        <label for="naam">Naam:
            <input type="text" id="naam" name="naam">
        </label>
        <br><br>
        <label for="voornaam">Voornaam:
            <input type="text" id="voornaam" name="voornaam">
        </label>
        <p>
            <input type="submit" value="Check dataset">
        </p>
    </form>
</body>
</html>
