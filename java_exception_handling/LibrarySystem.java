import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) { super(msg); }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String msg) { super(msg); }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String msg) { super(msg); }
}

class Library {
    private Map<String, Boolean> books = new HashMap<>();
    private int borrowedCount = 0;

    public Library() {
        books.put("Java", true);
        books.put("Python", true);
        books.put("C++", false);
    }

    public void borrowBook(String book) throws BookNotAvailableException, UserLimitExceededException {
        if (borrowedCount >= 5)
            throw new UserLimitExceededException("You cannot borrow more than 5 books!");
        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException("Book not available for borrowing!");
        books.put(book, false);
        borrowedCount++;
        System.out.println("You borrowed: " + book);
    }

    public void returnBook(String book) throws InvalidReturnException {
        if (!books.containsKey(book) || books.get(book))
            throw new InvalidReturnException("You cannot return this book!");
        books.put(book, true);
        borrowedCount--;
        System.out.println("Returned book: " + book);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook("C++");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
