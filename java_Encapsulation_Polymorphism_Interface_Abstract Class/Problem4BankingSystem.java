import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    protected void setBalance(double b) { this.balance = b; }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        setBalance(getBalance() + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (amount > getBalance()) return false;
        setBalance(getBalance() - amount);
        return true;
    }

    public abstract double calculateInterest(); // yearly interest
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        // 4% of balance
        return 0.04 * getBalance();
    }

    @Override
    public boolean applyForLoan(double amount) {
        // simple rule: balance must be >= 20% of loan
        return getBalance() >= 0.20 * amount;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // some multiplier for eligibility
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accNo, String name, double balance, double overdraftLimit) {
        super(accNo, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Current accounts usually get low/no interest
        return 0.0;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (amount > getBalance() + overdraftLimit) return false;
        setBalance(getBalance() - amount);
        return true;
    }
}

public class Problem4BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
            new SavingsAccount("S001","Charlie", 10000),
            new CurrentAccount("C001","Delta Corp", 50000, 20000)
        );

        for (BankAccount a : accounts) {
            System.out.printf("Account %s (%s): Balance=%.2f, YearlyInterest=%.2f%n",
                    a.getAccountNumber(), a.getHolderName(), a.getBalance(), a.calculateInterest());
            if (a instanceof Loanable) {
                Loanable l = (Loanable)a;
                System.out.printf(" Loan eligibility: %.2f, Apply for 50000: %s%n",
                        l.calculateLoanEligibility(), l.applyForLoan(50000) ? "Approved" : "Denied");
            }
            System.out.println();
        }
    }
}
