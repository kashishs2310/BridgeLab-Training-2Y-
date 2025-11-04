public class UserInputValidation {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] testInputs = {"20", "abc", "17", "30"};
        for (String input : testInputs) {
            System.out.println("Age: " + input + " → " + isValidAge(input));
        }
    }
}
