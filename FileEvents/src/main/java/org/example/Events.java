package org.example;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Events {
    public static void generateEventsFile(String filename, int numberOfRecords) throws IOException {

        String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        Random random = new Random();
        SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Use try-with-resources to ensure the writer is closed
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < numberOfRecords; i++) {
                long currentTimeMillis = System.currentTimeMillis();
                long randomTimeOffset = random.nextInt(1000 * 60 * 60 * 24 * 365); // Random offset within a year
                Date randomDate = new Date(currentTimeMillis - randomTimeOffset);
                String timestamp = timestampFormat.format(randomDate);

                // Select random event type
                String eventType = eventTypes[random.nextInt(eventTypes.length)];

                // Generate random User ID
                int userId = random.nextInt(1000);

                // Create record
                String record = timestamp + " | Event Type: " + eventType + " | User ID: " + userId;

                // Write to file
                writer.write(record);
                writer.newLine();
            }
            System.out.println("Event file generated successfully");
        }
    }
    public static void printEventsFromFile() throws FileNotFoundException {


    String Line;

        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;

            // Read lines until EOF
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle file reading errors
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }


    }

}
