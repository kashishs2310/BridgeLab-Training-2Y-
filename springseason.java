public class springseason {

    // Method to check if given month and day fall in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // March 20 to March 31
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // April (all days)
        else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // May (all days)
        else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // June 1 to June 20
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        // Otherwise, not Spring Season
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Get month and day from command line arguments
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
