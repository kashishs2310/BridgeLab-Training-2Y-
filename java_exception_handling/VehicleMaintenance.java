class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String msg) { super(msg); }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String msg) { super(msg); }
}

class Vehicle {
    private int mileage;
    private boolean serviceDue;

    public Vehicle(int mileage, boolean serviceDue) {
        this.mileage = mileage;
        this.serviceDue = serviceDue;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0)
            throw new InvalidMileageException("Invalid mileage entered!");
        if (serviceDue)
            throw new ServiceOverdueException("Service overdue! Please visit the workshop.");
        System.out.println("Vehicle maintenance is up to date!");
    }
}

public class VehicleMaintenance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(12000, true);
        try {
            v.checkMaintenance();
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println("Alert: " + e.getMessage());
        }
    }
}
