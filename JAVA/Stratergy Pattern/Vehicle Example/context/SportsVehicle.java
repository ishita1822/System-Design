package context;
// Concrete Context subclass - SportsVehicle

import strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {

    // constructor
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
