import java.util.*;
import java.util.function.Predicate;

class Product {
    String name;
    double price;
    boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - " + (inStock ? "In stock" : "Out of stock");
    }
}

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tablet", 300, true));
        products.add(new Product("Pen", 5, true));
        products.add(new Product("Backpack", 60, true));
        products.add(new Product("Notebook", 15, false));
        products.add(new Product("Smartwatch", 80, true));

        // keep only items under $50 AND in stock
        Predicate<Product> isAffordable =
                p -> !(p.price < 50 && p.inStock);

        products.removeIf(isAffordable);

        products.forEach(System.out::println);
    }
}
