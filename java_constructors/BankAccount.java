class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to modify balance
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass demonstrating protected and public access
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNum, String accHolder, double balance, double interestRate) {
        super(accNum, accHolder, balance);
        this.interestRate = interestRate;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123456", "Kashish Singh", 20000, 5.5);
        sa.displayAccountDetails();
        sa.deposit(5000);
        sa.withdraw(3000);
        sa.displayAccountDetails();
    }
}
