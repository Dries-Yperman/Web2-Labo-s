<%@ page import="domain.model.Student" %>
<%@ page import="domain.db.StudentDB" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dries
  Date: 07/03/2021
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Overzicht</title>
</head>
<body>
    <%
        StudentDB dataset = new StudentDB();
        ArrayList<String> names = dataset.getNames();
    %>
    <table>
        <%for (String naam: names) {%>
        <tr>
            <td><%=naam%></td>
        </tr>
        <%}%>
    </table>
</body>
</html>
