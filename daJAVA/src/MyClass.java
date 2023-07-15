import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String x = "ID: "+ id + "\nName:" + name+"\nPrice:" + price;
        return x;
    }

}

public class MyClass{
    public static void main(String[] args) {
        // Creating an ArrayList to store objects
        ArrayList<Product> productList = new ArrayList<>();

        // Adding three objects to the list
        productList.add(new Product(1, "Product A", 10.99));
        productList.add(new Product(2, "Product B", 5.99));
        productList.add(new Product(3, "Product C", 7.99));

        // Sorting the ArrayList in ascending order of price
        Collections.sort(productList, Comparator.comparingDouble(Product::getPrice));

        // Iterate through the sorted ArrayList using the Iterator
        System.out.println("Products sorted by price:\n");
        Iterator<Product> itr = productList.iterator();
        itr = productList.iterator();

        //Iterating through sorted list
        while (itr.hasNext()) {
            //System.out.println("lolo");
            System.out.println(itr.next());
            System.out.println("--------------------------------------------------");
        }
    }
}