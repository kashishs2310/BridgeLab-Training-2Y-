// Step 1: Create an Interface
interface Vehicle {
    void rent();
    void returnVehicle();
}

// Step 2: Implement Interface in Different Vehicle Classes

// Car class
class Car implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Car has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

// Bike class
class Bike implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

// Bus class
class Bus implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Bus has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}

// Step 3: Test the Implementation
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        System.out.println("--- Returning vehicles ---");
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
