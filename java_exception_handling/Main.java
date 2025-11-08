// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// ATM Class
class ATM {
    private double balance;

    // Constructor to initialize balance
    public ATM(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! You tried to withdraw ₹" + amount + 
                                                 " but your available balance is ₹" + balance + ".");
        } else if (amount <= 0) {
            throw new InsufficientFundsException("Invalid amount! Please enter an amount greater than ₹0.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! ₹" + amount + " withdrawn.");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);  // initial balance ₹10,000

        try {
            atm.withdraw(12000);  // trying to withdraw more than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Trying another transaction ---");

        try {
            atm.withdraw(2500);  // valid withdrawal
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
