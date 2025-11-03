import java.util.ArrayList;

class Customer {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.accountNumber + " | Balance: ₹" + acc.balance);
        }
        System.out.println();
    }
}

class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        customer.accounts.add(account);
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("GLA Bank");
        Customer c1 = new Customer("Kashish");
        Customer c2 = new Customer("Aarav");

        Account a1 = new Account(101, 5000);
        Account a2 = new Account(102, 10000);
        Account a3 = new Account(103, 20000);

        bank.openAccount(c1, a1);
        bank.openAccount(c1, a2);
        bank.openAccount(c2, a3);

        c1.viewBalance();
        c2.viewBalance();
    }
}
