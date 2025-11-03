class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter & Setter for private variable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);       // public
        System.out.println("Title: " + title);     // protected
        System.out.println("Author: " + getAuthor());
        System.out.println("Format: " + format);
    }

    public static void main(String[] args) {
        EBook e = new EBook("12345", "Java Made Easy", "James Gosling", "PDF");
        e.displayDetails();
    }
}
