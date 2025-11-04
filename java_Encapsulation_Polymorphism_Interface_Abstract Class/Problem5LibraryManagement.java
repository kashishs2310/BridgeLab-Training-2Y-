import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author; // could also be publisher etc.

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId(){ return itemId; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }

    public String getItemDetails() {
        return String.format("ID:%s, Title:%s, Author:%s", itemId, title, author);
    }

    public abstract int getLoanDuration(); // days
}

interface Reservable {
    boolean reserveItem(String borrowerId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 21; } // 3 weeks

    @Override
    public boolean reserveItem(String borrowerId) {
        if (!available) return false;
        available = false;
        return true;
    }

    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 7; } // 1 week
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 5; }

    @Override
    public boolean reserveItem(String borrowerId) {
        if (!available) return false;
        available = false;
        return true;
    }

    @Override
    public boolean checkAvailability() { return available; }
}

public class Problem5LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> items = Arrays.asList(
            new Book("B001","Pride and Prejudice","Austen"),
            new Magazine("M001","Time - Nov 2025","Time"),
            new DVD("D001","Inception","Nolan")
        );

        for (LibraryItem it : items) {
            System.out.println(it.getItemDetails() + ", LoanDays=" + it.getLoanDuration());
            if (it instanceof Reservable) {
                Reservable r = (Reservable)it;
                System.out.println(" Availability: " + r.checkAvailability());
            }
            System.out.println();
        }
    }
}
