public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // variable initialized to null

        // This will generate NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;

        try {
            // This will throw NullPointerException
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught NullPointerException: " + e.getMessage());
            System.out.println("You tried to call a method on a null object.");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Demonstrating NullPointerException ===");
        // Call the method that generates the exception (unhandled)
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling NullPointerException using try-catch ===");
        // Call the method that handles the exception properly
        handleException();
    }
}
