import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBookInfo() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;  // Aggregation: Library "has-a" relationship with Book

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBookInfo();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Java Programming", "James Gosling");
        Book b3 = new Book("Atomic Habits", "James Clear");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Tech Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b3);
        lib2.addBook(b1);  // same book in another library

        lib1.displayLibraryBooks();
        lib2.displayLibraryBooks();
    }
}
