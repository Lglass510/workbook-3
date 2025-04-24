package pluralsight;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;




public class SearchInventoryMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Loads product into inventory
        String filePath = ("src\\main\\resources\\inventory.csv");
        loadInventory(filePath);
        boolean continueSearching = true;

        while(continueSearching) {
            System.out.println("Enter product name to search: ");
            String productName = sc.nextLine();

            searchProduct(productName);

            System.out.println("Do you want to search again? (yes/no): ");
            String response = sc.nextLine();

            if (!response.equalsIgnoreCase("yes")) {
                continueSearching = false;
                System.out.println("BYE!");

            }
        }
        sc.close();

    }

    String filePath = ("src\\main\\resources\\inventory.csv");
    //Hash map to hold products with the name as the key

    private static HashMap<String,Product> inventory = new HashMap<String, Product>();
    //Method loads products from file to map

    public static void loadInventory(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/inventory.csv"))) {
            String line;
            br.readLine(); //Skip header

            while ((line = br.readLine()) != null) {
                //Take the string of product details and split with commas
                String[] productDetails = line.split("\\|");
                //Convert types
                int id = Integer.parseInt(productDetails[0]);
                String name = productDetails[1];
                double price = Double.parseDouble(productDetails[2]);


                //create product and use its name as key
                String standardCaseName = name.toLowerCase().trim();
                Product product = new Product(id, name, price);
                inventory.put(standardCaseName, product);
            }
        } catch (IOException e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
        }
    }
    //Method to search for product by name

    public static void searchProduct(String productName) {
        String standardCase = productName.toLowerCase().trim();
        Product product = inventory.get(standardCase);

        if (product != null) {
            System.out.println("Found: " + product);

        } else {
            System.out.println("Product not found.");
        }
    }







}


