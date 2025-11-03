// Program 2: Circle Class with Constructor Chaining

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("\nRadius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        c1.display();
        c2.display();
    }
}
