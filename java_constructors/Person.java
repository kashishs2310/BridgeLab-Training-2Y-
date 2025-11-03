// Program 3: Person Class with Copy Constructor

class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kashish", 20);
        Person p2 = new Person(p1); // copy constructor

        p1.display();
        p2.display();
    }
}
