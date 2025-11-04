import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName(){ return itemName; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }

    public void setQuantity(int q){ this.quantity = q; }

    public String getItemDetails() {
        return String.format("%s x%d - %.2f each", itemName, quantity, price);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount(); // returns discount amount
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        double total = calculateTotalPrice();
        return total >= 500 ? 50 : 0; // rupee discount example
    }

    @Override
    public String getDiscountDetails() { return "Flat Rs.50 for orders >= 500"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        double extraCharge = 20 * getQuantity(); // packaging or special handling
        return getPrice() * getQuantity() + extraCharge;
    }

    @Override
    public double applyDiscount() {
        double total = calculateTotalPrice();
        return total >= 700 ? 100 : 0;
    }

    @Override
    public String getDiscountDetails() { return "Flat Rs.100 for orders >= 700"; }
}

public class Problem6FoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> order = Arrays.asList(
            new VegItem("Paneer Butter Masala", 250, 2),
            new NonVegItem("Chicken Biryani", 350, 1)
        );

        double total = 0;
        double discount = 0;
        for (FoodItem f : order) {
            double itemTotal = f.calculateTotalPrice();
            total += itemTotal;
            if (f instanceof Discountable) {
                Discountable d = (Discountable)f;
                double dAmt = d.applyDiscount();
                discount += dAmt;
                System.out.printf("%s => %.2f, Discount: %.2f (%s)%n",
                        f.getItemDetails(), itemTotal, dAmt, d.getDiscountDetails());
            } else {
                System.out.printf("%s => %.2f%n", f.getItemDetails(), itemTotal);
            }
        }
        System.out.printf("Order Total: %.2f, Total Discount: %.2f, Payable: %.2f%n",
                total, discount, total - discount);
    }
}
