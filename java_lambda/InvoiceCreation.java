import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice created for Transaction ID: " + transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003");

        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new) // Constructor reference
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
