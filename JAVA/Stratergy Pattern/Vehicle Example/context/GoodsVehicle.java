package context;

import strategy.DriveStrategy;

// Concrete context subclass - GoodsVehicle
public class GoodsVehicle extends Vehicle {

    // constructor
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}