import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { System.out.println("Cart items: " + items); }
}

public class GenericCartTest {
    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");
        electronicsCart.addItem("Phone");
        electronicsCart.displayItems();

        Cart<String> clothingCart = new Cart<>();
        clothingCart.addItem("T-shirt");
        clothingCart.addItem("Jeans");
        clothingCart.displayItems();
    }
}
