import java.io.*;
import java.util.Scanner;



public class Products {


    //Displaying Fields
    int sku;
    String name;
    double price;
    String department;

    public static void main(String[] args) {

        try {

        /*Using file input stream to point to a specific file
        than creating my scanner to reference the file I want read
         */
            FileInputStream fis = new FileInputStream("products.csv");
            Scanner sc = new Scanner(fis);
            String input;

            //Read the file separate the lines and display the input
            while (sc.hasNextLine()) {
                input = sc.nextLine();
                System.out.println(input);
            }
            //closing my scanner
            sc.close();

            //Display message if unable to read file;
        } catch(IOException e) {
            System.out.println("Unable to read file");
        }


    }






}


