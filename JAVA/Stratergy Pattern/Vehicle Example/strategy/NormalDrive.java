package strategy;

// Concrete Strategy - Implements the drive behavior for Normal mode.
public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability in normal mode.");
    }
}