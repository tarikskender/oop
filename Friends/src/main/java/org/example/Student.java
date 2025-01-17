package org.example;

public class Student {
    // Private fields for encapsulation
    private int id;
    private String name;
    private String university;
    private String department;
    private double gpa;

    // Constructor to initialize fields
    public Student(int id, String name, String university, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }

    // Getter methods for each field
    public int getId() {
        return id;
    }

    public String getName() throws StudentNotFoundException {
        if(name == null || name.isEmpty()){
            throw new StudentNotFoundException("Name not available for student ID: "+ id);
        }
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", University='" + university + '\'' +
                ", Department='" + department + '\'' +
                ", GPA=" + gpa +
                '}';
    }
}
