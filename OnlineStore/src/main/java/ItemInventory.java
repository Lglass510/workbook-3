import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ItemInventory {


    public static void displayProducts(String filename) {

        List<Product> products = new ArrayList<>();


        try {

        /*Using file input stream to point to a specific file
        than creating my scanner to reference the file I want read
         */
            FileInputStream fis = new FileInputStream("src\\main\\resources\\products.csv");
            Scanner sc = new Scanner(fis);



            //Skip header
          if (sc.hasNextLine()) {
              sc.nextLine();
            }


            /*Read all data in file and
            separate the lines by | and display the input*/

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] fields = line.split("\\|");

                //Parse values
                if(fields.length == 4) {
                    String SKU = fields[0];
                    String name = fields[1];
                    double price = Double.parseDouble(fields[2]);
                    String department = fields[3];


                    Product product = new Product(SKU, name, price, department);
                    products.add(product);
                    System.out.println(product);
                }
            }
            //closing my scanner
            sc.close();

            //Display message if unable to read file;
        } catch(IOException e) {
            System.out.println("Unable to read file");
        }

    }

    public static void main(String[] args) {
        displayProducts("products.csv");

    }


















}


