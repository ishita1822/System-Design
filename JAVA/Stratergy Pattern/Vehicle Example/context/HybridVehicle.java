package context;

import strategy.DriveStrategy;

// Concrete context subclass - HybridVehicle
public class HybridVehicle extends Vehicle {

    // constructor
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}