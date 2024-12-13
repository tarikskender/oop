package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String name;
    public String id;

    private ArrayList<Integer> grades;

    public Student(String name, String id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }


}
