package domain.db;

import domain.model.Student;

import java.util.ArrayList;

public class StudentDB {

    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }

    public Student isStudentInDataset(String naam, String voornaam){
        for (Student student: students){
            if (student.isSamePerson(naam, voornaam)) return student;
        }
        return null;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

}
