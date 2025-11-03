// Program 6: Car Rental System

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500.0; // fixed cost for simplicity

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Not Selected";
        rentalDays = 0;
    }

    // Parameterized constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("\nCustomer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Riya Kapoor", "Honda City", 5);

        r1.display();
        r2.display();
    }
}
