import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber(){ return vehicleNumber; }
    public String getType(){ return type; }
    public double getRentalRate(){ return rentalRate; }

    public void setRentalRate(double rate){ this.rentalRate = rate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private double insurancePremium;

    public Car(String num, double rate, double insurancePremium) {
        super(num, "Car", rate);
        this.insurancePremium = insurancePremium;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() { return insurancePremium; }

    @Override
    public String getInsuranceDetails() { return "Car policy"; }
}

class Bike extends Vehicle implements Insurable {
    private double insurancePremium;

    public Bike(String num, double rate, double insurancePremium) {
        super(num, "Bike", rate);
        this.insurancePremium = insurancePremium;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() { return insurancePremium; }

    @Override
    public String getInsuranceDetails() { return "Bike policy"; }
}

class Truck extends Vehicle {
    public Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        // truck might have extra loading fee
        double loadingFee = 500 * days;
        return days * getRentalRate() + loadingFee;
    }
}

public class Problem3VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> fleet = Arrays.asList(
            new Car("KA01A1111", 3000, 15000),
            new Bike("KA01B2222", 500, 2000),
            new Truck("KA01T3333", 7000)
        );

        int days = 3;
        for (Vehicle v : fleet) {
            System.out.printf("Vehicle %s (%s): RentalCost( %d days ) = %.2f%n",
                    v.getVehicleNumber(), v.getType(), days, v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable in = (Insurable)v;
                System.out.printf(" Insurance: %s - %.2f%n", in.getInsuranceDetails(), in.calculateInsurance());
            } else {
                System.out.println(" Insurance: Not provided by system");
            }
            System.out.println();
        }
    }
}
