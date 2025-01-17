package org.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentSystem {

    public String filename;
    public static ArrayList<Student> students = new ArrayList<>();

    public static void ReadFile(String filename){
        try (
                BufferedReader reader = new BufferedReader(new FileReader(filename))){
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
        catch (
                FileNotFoundException e){
            System.err.println("File not found: " + filename);
        }
        catch (
                IOException e){
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private void validateStudentData(List<Student> studentList) throws InvalidStudentDataException{
        for(Student eachStudent : studentList){
            if(eachStudent.getGpa()<6 || eachStudent.getGpa()>10)
                throw new InvalidStudentDataException("Read data has invalid rows.");
        }
    }

    public StudentSystem(String filename) throws InvalidStudentDataException {
        this.filename = filename;
        ReadFile(filename);
        validateStudentData(students);
    }

    public static List<Student> readStudents(String filename) throws EmptyStudentListException{
        ReadFile(filename);
        if(students.isEmpty()){
            throw new EmptyStudentListException("List of students is empty.");
        }
        return students;
    }

    public static int noOfStudents(){
        return students.size();
    }

    public static Optional<Student> getStudentById(int id){
        for(Student each : students){
            if(each.getId() == id)
                return Optional.of(each);
        }
        return Optional.empty();
    }

    public static Student getHighestGPAStudent(){
        double MAX = students.getFirst().getGpa();
        Student highestGPAStudent = students.getFirst();
        for(Student each : students){
            if(each.getGpa()>MAX){
                MAX = each.getGpa();
                highestGPAStudent = each;
            }
        }
        return highestGPAStudent;
    }

    public static Student getLongestNameStudent(){
        Student LongestNameStudent = students.getFirst();

        for(Student each : students){
            int MAX = LongestNameStudent.getName().length();
            if(each.getName().length()>MAX){
                LongestNameStudent = each;
            }
        }

        return LongestNameStudent;
    }



}
