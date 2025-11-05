interface SecurityUtils {
    // Static method to check password strength
    static boolean isStrongPassword(String password) {
        // Password policy:
        // - At least 8 characters
        // - Contains at least one uppercase letter
        // - Contains at least one lowercase letter
        // - Contains at least one digit
        // - Contains at least one special character

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

// Main class to test the password validator
public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String[] passwords = {
            "Hello123",         // weak
            "Strong@123",       // strong
            "weakpass",         // weak
            "P@ssw0rd!",        // strong
            "Short1!"           // weak
        };

        for (String pwd : passwords) {
            if (SecurityUtils.isStrongPassword(pwd)) {
                System.out.println(" '" + pwd + "' is a strong password.");
            } else {
                System.out.println(" '" + pwd + "' is a weak password.");
            }
        }
    }
}
