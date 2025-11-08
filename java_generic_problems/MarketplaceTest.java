class ProductCategory {}
class BookCategory extends ProductCategory {}
class ClothingCategory extends ProductCategory {}

class Product<T extends ProductCategory> {
    String name;
    double price;
    Product(String name, double price) { this.name = name; this.price = price; }
    public double getPrice() { return price; }
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double discounted = product.getPrice() - (product.getPrice() * percent / 100);
        System.out.println("Discounted price of " + product.name + ": ₹" + discounted);
    }
}

public class MarketplaceTest {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500);
        Product<ClothingCategory> shirt = new Product<>("Shirt", 1200);

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 20);
    }
}
