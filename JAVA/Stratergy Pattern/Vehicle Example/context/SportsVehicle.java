package context;

import strategy.DriveStrategy;

// Concrete Context subclass - SportsVehicle
public class SportsVehicle extends Vehicle {

    // constructor
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
