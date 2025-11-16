package strategy;

// Concrete Strategy - Implements the drive behavior for Electric Vehicle mode.
public class EVDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability in EV mode.");
    }
}
