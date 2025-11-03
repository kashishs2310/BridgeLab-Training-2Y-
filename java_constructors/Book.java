// Program 1: Book Class with Default and Parameterized Constructors

class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Not Available";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayDetails() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book(); // using default constructor
        Book b2 = new Book("1984", "George Orwell", 399.99); // using parameterized constructor

        b1.displayDetails();
        b2.displayDetails();
    }
}
