import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId(){ return vehicleId; }
    public String getDriverName(){ return driverName; }
    public double getRatePerKm(){ return ratePerKm; }

    public void setRatePerKm(double rate){ this.ratePerKm = rate; }

    public String getVehicleDetails() {
        return String.format("%s (%s) - RatePerKm: %.2f", driverName, vehicleId, ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location;
    public Car(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) {
        double baseFare = 50;
        return baseFare + getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation(){ return location == null ? "Unknown" : location; }

    @Override
    public void updateLocation(String newLocation){ this.location = newLocation; }
}

class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no base fare
    }

    @Override
    public String getCurrentLocation(){ return location == null ? "Unknown" : location; }

    @Override
    public void updateLocation(String newLocation){ this.location = newLocation; }
}

class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) {
        double minimum = 30;
        double fare = getRatePerKm() * distance;
        return Math.max(minimum, fare);
    }

    @Override
    public String getCurrentLocation(){ return location == null ? "Unknown" : location; }

    @Override
    public void updateLocation(String newLocation){ this.location = newLocation; }
}

public class Problem8RideHailing {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Car("CAR001","Gaurav", 15),
            new Bike("BIKE001","Himanshu", 8),
            new Auto("AUTO001","Irfan", 10)
        );

        double distance = 12.5;
        for (Vehicle v : vehicles) {
            System.out.printf("%s => Fare for %.2f km = %.2f%n",
                    v.getVehicleDetails(), distance, v.calculateFare(distance));
        }
    }
}
