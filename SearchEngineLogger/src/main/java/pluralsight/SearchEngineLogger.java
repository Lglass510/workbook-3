package pluralsight;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SearchEngineLogger {
    // custom method logs user input with timestamp
    public static void logAction(String message) {



        //sets the format we want for the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //grabs the current date and time
        String timestamp = LocalDateTime.now().format(formatter);

        //creates the file writer and the buffer reader & writes input to logs.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt", true))) {
            // current date/time space user message
            writer.write(timestamp + " " + message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Could not write to  log file.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logAction("LAUNCH");

        sc.nextLine();

        // keep running program until user hits x
        while (true) {
            System.out.println("Enter a search term (X to exit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("X")) {
                logAction("exit");
                System.out.println("SEE YA!");
                break;
            }

            // logs what the user searched and prints out
            logAction("search : " + input);
            System.out.println("Searching for: " + input);
        }

        sc.close();
    }


    }





