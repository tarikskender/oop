package org.example;

import java.util.ArrayList;

public class GradeAnalyzer {

    private final ArrayList<Integer> grades;
    int sum = 0;
    double average;

    public GradeAnalyzer(ArrayList<Integer> grades){
        this.grades = grades;
    }

    private double calculateAverage(){
        grades.forEach(grade -> sum += grade);
        if (!grades.isEmpty()) { // Avoid division by zero
            average = (double) sum / grades.size();
        } else {
            average = 0;
        }
        return average;
    }

}
