package db;

import model.Student;
import java.util.ArrayList;
import java.util.List;


public class DBManager {
    public static List<Student> studentList = new ArrayList<>();

    static{
        studentList.add(new Student("Yerkin","Kozganbay","Astana"));
        studentList.add(new Student("Leo","Messi","Almaty"));
        studentList.add(new Student("Yerbol","Kanafin","Taraz"));


    }


    public static List<Student>getStudentList

    public  void addStudent(Student student) {
        studentList.add(student);
    }
}
