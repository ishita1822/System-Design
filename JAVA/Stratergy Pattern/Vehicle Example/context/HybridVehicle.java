package context;
// Concrete context subclass - HybridVehicle

import strategy.DriveStrategy;

public class HybridVehicle extends Vehicle {

    // constructor
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}