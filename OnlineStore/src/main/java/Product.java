


public class Product {

    //Fields
    String sku;
    String name;
    double price;
    String department;

    //Constructor
    public Product(String sku, String name, double price, String department) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.department = department;
    }


    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDepartment() {
        return department;
    }



//Override java toString format
@Override
public String toString() {
        return "Item SKU " + sku
                + "Item Name: " + name +
                "Item Price " + price +
                "Item Department: " + department;
}


}
