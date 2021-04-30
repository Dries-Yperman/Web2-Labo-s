<%@ page import="domain.model.Student" %>
<%@ page import="domain.db.StudentDB" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ui.controller.GETNameServlet" %><%--
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
        StudentDB dataset = GETNameServlet.dataset;
    %>
    <table>
        <%for (Student student: dataset.getStudents()) {%>
        <tr>
            <td><%=student.getNaam()%></td>
            <td><%=student.getVoornaam()%></td>
            <td><%=student.getLeeftijd()%></td>
            <td><%=student.getStudierichting()%></td>
        </tr>
        <%}%>
    </table>
    <form action="studentForm.jsp">
        <input type="submit" value="ADD STUDENT">
    </form>
</body>
</html>
