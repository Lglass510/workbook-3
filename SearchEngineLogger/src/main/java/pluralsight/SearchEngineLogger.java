package pluralsight;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SearchEngineLogger {
    // Methods
    public static void logAction(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt", true))) {
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


        while (true) {
            System.out.println("Enter a search term (X to exit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("X")) {
                logAction("exit");
                System.out.println("SEE YA!");
                break;
            }


            logAction("search : " + input);
            System.out.println("Searching for: " + input);
        }

        sc.close();
    }


    }





