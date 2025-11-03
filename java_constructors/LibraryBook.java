// Program 5: Library Book System

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String t, String a, double p, boolean av) {
        title = t;
        author = a;
        price = p;
        available = av;
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("\nYou have borrowed \"" + title + "\".");
        } else {
            System.out.println("\nSorry, \"" + title + "\" is not available.");
        }
    }

    void display() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 299.0, true);
        book1.display();
        book1.borrowBook();
        book1.display();
    }
}
