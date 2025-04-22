package pluralsight;
import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Choose a bedtime story: goldilocks.txt, hansel_and_gretel.txt or mary_had_a_little_lamb.txt");
        String fileName = inputScanner.nextLine();

        String filePath = "C:\\Users\\Student\\pluralsight\\workbook-3\\BedtimeStories\\DataFiles\\" + fileName;




        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Student\\pluralsight\\workbook-3\\BedtimeStories\\DataFiles\\" + fileName);
            Scanner scanner = new Scanner(fis);

            String input;
            while(scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);}
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.getStackTrace();
            System.out.println("File could not be found.");

        }








    }




}
