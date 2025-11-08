class Fruit {
    public String name;
    Fruit(String name) { this.name = name; }
}

class Apple extends Fruit {
    Apple() { super("Apple"); }
}

class Mango extends Fruit {
    Mango() { super("Mango"); }
}

class FruitBox<T extends Fruit> {
    private T fruit;

    public void add(T fruit) { this.fruit = fruit; }
    public void display() { System.out.println("Stored fruit: " + fruit.name); }
}

public class FruitStorageTest {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.display();

        // FruitBox<Car> carBox = new FruitBox<>(); // ❌ Compile error – Car not a Fruit
    }
}
