package ui.controller;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/StudentInfo")
public class GETNameServlet extends HttpServlet {

    private StudentDB dataset = new StudentDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("doGet called");

        String naam = request.getParameter("naam");
        String voornaam = request.getParameter("voornaam");

        String resultMessage = "";
        String page = "";
        Student student = dataset.isStudentInDataset(naam, voornaam);
        if (student != null){
            resultMessage = student.getNaam() + " " + student.getVoornaam() + " (" + student.getLeeftijd() + " jaar): " + student.getStudierichting();
            page = "gevonden.jsp";
        }
        else {
            resultMessage = "niet in dataset";
            page = "nietgevonden.jsp";
        }

        System.out.println(resultMessage);
        System.out.println(page);

        request.setAttribute("resultMessage", resultMessage);

        RequestDispatcher view = request.getRequestDispatcher(page);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
