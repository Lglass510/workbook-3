package pluralsight;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product (int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Name: " + name + ", Price: $" + price;
    }

}

public class SearchInventoryMap {

    //Map to hold products with the name as the key
    private static Map<String, Product> inventory = new HashMap<>();

    //Method loads products from file to map
    public static void loadInventory() {
        try (BufferedReader br = new BufferedReader(new FileReader("Inventory.csv"))) {
            String line;
            br.readLine(); //Skip header

            while ((line = br.readLine()) != null) {
                String[] productDetails = line.split(",");
                int id = Integer.parseInt(productDetails[0]);
                String name = productDetails[1];
                double price = Double.parseDouble(productDetails[2]);


                //create product and use its name as key
                Product product = new Product(id, name, price);
                inventory.put(name, product);
            }
        } catch (IOException e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
        }
    }

    //Method to search for product by name
    public static void searchProduct(String productName) {
        Product product = inventory.get(productName);
        if (product != null) {
            System.out.println("Found: " + product);

        } else {
            System.out.println("Product not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        loadInventory();
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







}


