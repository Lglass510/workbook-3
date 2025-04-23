package pluralsight;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

            //loop through and print each product
            for (Product product : inventory) {
                System.out.println(product);
            }
    }
    //method to get list of products
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(4567, "10' 2x4 (grade B", 9.99));
        products.add(new Product(1234, "Hammer", 19.49));
        products.add(new Product(2345, "Box of nails", 9.29));
        products.add(new Product(9876, "Tape Measure", 7.50));

        //return list of products
        return products;
    }







}
