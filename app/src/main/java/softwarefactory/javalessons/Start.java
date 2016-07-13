package softwarefactory.javalessons;

/**
 * Created by James Hunter on 7/6/2016.
 */


import java.util.ArrayList;

import static softwarefactory.javalessons.MainActivity.*;

public class Start {

    public static ArrayList<Student> students = new ArrayList<>();



    public static void addStudent(String name){
        Student student = new Student();
        student.setName(name);
        students.add(student);
    }

    public static void deleteStudent(String name){
        name = name.trim();
        boolean found = false;
        for (Student student : students) {
            if (student.getName().compareTo(name) == 0){
                found = true;
                students.remove(student);
                break;
            }
        }
        if(!found){
            setConfirmation(false, "Student not found!");
        } else {
            setConfirmation(true, "Student deleted successfully");
        }

    }

    public static String printStudents() {
        String list = "";

        for (Student student : students) {
            list += student.getName() + "\n";
        }

        return list;
    }
}

