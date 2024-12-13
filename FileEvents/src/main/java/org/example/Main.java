package org.example;
import java.io.IOException;
import java.lang.reflect.Method;

import static org.example.Events.generateEventsFile;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IOException {

//        Method generateEventsMethod = Events.class.getDeclaredMethod("generateEventsFile", String.class, int.class);
//        generateEventsMethod.setAccessible(true);
//        generateEventsMethod.invoke("events.txt", );

        generateEventsFile("events.txt", 10);
//        printEventsFromFile("events.txt");

    }
}
