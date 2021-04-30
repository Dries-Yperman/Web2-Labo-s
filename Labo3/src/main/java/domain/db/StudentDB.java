package domain.db;

import domain.model.Student;

import java.util.ArrayList;

public class StudentDB {

    ArrayList<Student> students = new ArrayList<Student>();

    public StudentDB() {
        students.add(new Student("Jongen", "Greetje", 23, "Toegepaste Informatica"));
        students.add(new Student("Melaerts", "Kristien", 21, "Chemie"));
        students.add(new Student("Steegmans", "Elke", 16, "Vroedkunde"));
        students.add(new Student("Van Hee", "Jan", 18, "Verpleegkunde"));
    }

    public Student isStudentInDataset(String naam, String voornaam){
        for (Student student: students){
            if (student.isSamePerson(naam, voornaam)) return student;
        }
        return null;
    }

    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<String>();
        for (Student student: students){
            names.add(student.getNaam());
        }
        return names;
    }

}
