import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) { super(msg); }
}

class InsufficientFundsException2 extends Exception {
    public InsufficientFundsException2(String msg) { super(msg); }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) { super(msg); }
}

class Transaction {
    public void processTransaction() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random r = new Random();
        int n = r.nextInt(3);
        switch (n) {
            case 0 -> throw new NegativeAmountException("Transaction failed: Negative amount!");
            case 1 -> throw new InsufficientFundsException2("Transaction failed: Insufficient funds!");
            case 2 -> throw new NetworkFailureException("Transaction failed: Network issue!");
        }
    }
}

public class BankingTransaction {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.processTransaction();
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
