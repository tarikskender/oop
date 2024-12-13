package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        String filePath = "/Users/skendimac/Documents/java/Friends/src/main/java/org/example/students.csv";;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String Line;
            while((Line = reader.readLine()) != null){

                String[] fields = Line.split(",");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                String university = fields[2];
                String department = fields[3];
                double gpa = Double.parseDouble(fields[4]);

                Student student = new Student(id,name,university,department,gpa);
                students.add(student);
            }
        }
        catch (FileNotFoundException e){
            System.err.println("File not found: " + filePath);
        }
        catch (IOException e){
            System.err.println("Error reading the file: " + e.getMessage());
        }

        for(Student each : students){
            System.out.println(each.getName());
        }
    }
}
