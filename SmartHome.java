// Step 1: Create the Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Step 2: Implement the Interface in Multiple Classes

// Light class
class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}

// Air Conditioner class
class AirConditioner implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is now OFF.");
    }
}

// TV class
class TV implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

// Step 3: Test the implementation
public class SmartHome {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        System.out.println("--- Turning off devices ---");
        
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
