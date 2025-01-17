package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Week1 week1 = new Week1();

        List<Integer> numbers = Arrays.asList(15, 8, 22, 7, 14, 3, 11, 18, 6, 9);

        System.out.println(week1.getSortedEvenNumbers(numbers));

    }

    static class Week1{

        public List<Integer> getSortedEvenNumbers(List<Integer> list){
            List<Integer> NewList = new ArrayList<>();

            for(Integer number : list){
                if(number%2==0){
                    NewList.add(number);
                }
            }

            return NewList;
        }
    }
}