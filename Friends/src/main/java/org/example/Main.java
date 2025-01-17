package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import static org.example.StudentSystem.readStudents;


public class Main {
    public static void main(String[] args) throws StudentNotFoundException {


        String filePath = "/Users/skendimac/Documents/java/Friends/src/main/java/org/example/students.csv";

        List<Student> students = StudentSystem.readStudents(filePath);

        for(Student record : students){
            System.out.println(record);
        }

        System.out.println(StudentSystem.noOfStudents());
        System.out.println(StudentSystem.getStudentById(2));
        System.out.println(StudentSystem.getHighestGPAStudent());
        System.out.println(StudentSystem.getLongestNameStudent());


    }
}
