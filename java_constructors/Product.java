// Problem 1: Product Inventory

class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all objects)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment count whenever a new product is created
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method to display total products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Create product objects
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Headphones", 2500);
        Product p3 = new Product("Smartphone", 40000);

        // Display product details
        System.out.println("Product 1 Details:");
        p1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        p2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3 Details:");
        p3.displayProductDetails();
        System.out.println();

        // Display total number of products created
        Product.displayTotalProducts();
    }
}
