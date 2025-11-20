package context;

import strategy.DriveStrategy;

// Context class - holds a reference to the strategy
public class Vehicle {
    DriveStrategy driveStrategy;

    // constructor injection of the strategy
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void performDrive() {
        System.out.println("Vehicle is using the strategy: " + driveStrategy.getClass().getSimpleName());
        driveStrategy.drive();
        System.out.println();

    }

}