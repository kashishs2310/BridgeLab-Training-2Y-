import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}

class Electronics extends WarehouseItem { Electronics(String name) { super(name); } }
class Groceries extends WarehouseItem { Groceries(String name) { super(name); } }
class Furniture extends WarehouseItem { Furniture(String name) { super(name); } }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list)
            System.out.println(i);
    }
}

public class WarehouseTest {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("TV"));
        Storage.displayAll(electronicsStorage.getItems());
    }
}
