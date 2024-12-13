package org.example;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.lang.annotation.Annotation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<Integer> gradeList = new ArrayList<>();
        gradeList.add(90);
        gradeList.add(85);
        gradeList.add(88);

        Student student = new Student("John Doe", "12345", gradeList);

        Class<?> gradeAnalyzerClass = GradeAnalyzer.class;
        Method[] methodList;

        Method method = gradeAnalyzerClass.getDeclaredMethod("calculateAverage");
        method.setAccessible(true);

        methodList = gradeAnalyzerClass.getDeclaredMethods();

        GradeAnalyzer grades = new GradeAnalyzer(gradeList);

        for(Method every : methodList){
            every.setAccessible(true);
            if(every.getName().startsWith("calculate")){
                System.out.println(every.invoke(grades));
                System.out.println("Method that was invoked is called " + every.getName() + " and it's type is: " + every.getReturnType().toString());
            }
        }



    }
}