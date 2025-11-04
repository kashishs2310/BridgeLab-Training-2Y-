import java.util.*;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId(){ return productId; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }

    public void setPrice(double price){ this.price = price; }

    public abstract double calculateDiscount(); // absolute discount amount
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() {
        // example: 5% discount
        return 0.05 * getPrice();
    }

    @Override
    public double calculateTax() {
        // example tax 18%
        return 0.18 * getPrice();
    }

    @Override
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() {
        // flat 10% seasonal discount
        return 0.10 * getPrice();
    }

    @Override
    public double calculateTax() {
        return 0.05 * getPrice();
    }

    @Override
    public String getTaxDetails() { return "GST 5%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() {
        // groceries might have no discount in this example
        return 0.0;
    }
}

public class Problem2ECommerce {
    public static void printFinalPrice(Product p) {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = 0.0;
        String taxInfo = "N/A";
        if (p instanceof Taxable) {
            Taxable t = (Taxable)p;
            tax = t.calculateTax();
            taxInfo = t.getTaxDetails();
        }
        double finalPrice = price + tax - discount;
        System.out.printf("%s (%s): Price=%.2f, Tax=%s(%.2f), Discount=%.2f => Final=%.2f%n",
                p.getName(), p.getProductId(), price, taxInfo, tax, discount, finalPrice);
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Electronics("E100","Smartphone",30000),
            new Clothing("C200","Jacket",2500),
            new Groceries("G300","Rice 5kg",400)
        );

        for(Product p : products) printFinalPrice(p);
    }
}
