package ui.controller;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/StudentInfo")
public class GETNameServlet extends HttpServlet {

    public static StudentDB dataset = new StudentDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

        String naam = request.getParameter("naam");
        String voornaam = request.getParameter("voornaam");
        int leeftijd = Integer.parseInt(request.getParameter("leeftijd"));
        String studierichting = request.getParameter("studierichting");

        System.out.println(naam);
        System.out.println(voornaam);
        System.out.println(leeftijd);
        System.out.println(studierichting);

        Student addedStudent = new Student(naam, voornaam, leeftijd, studierichting);
        dataset.addStudent(addedStudent);

        RequestDispatcher view = request.getRequestDispatcher("studentInfoOverzicht.jsp");
        view.forward(request, response);
    }
}
