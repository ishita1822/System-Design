// ...existing code...
public class FullCode {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(new NormalDrive());
        car.performDrive();

        Vehicle sports = new SportsVehicle(new SportsDrive());
        sports.performDrive();

        Vehicle hybrid = new HybridVehicle(new EVDrive());
        hybrid.performDrive();
    }

    // Strategy interface
    public interface DriveStrategy {
        void drive();
    }

    // Concrete strategies
    public static class NormalDrive implements DriveStrategy {
        @Override
        public void drive() {
            System.out.println("Driving in normal mode.");
        }
    }

    public static class EVDrive implements DriveStrategy {
        @Override
        public void drive() {
            System.out.println("Driving in electric mode.");
        }
    }

    public static class SportsDrive implements DriveStrategy {
        @Override
        public void drive() {
            System.out.println("Driving in sports mode.");
        }
    }

    // Context
    public static class Vehicle {
        protected final DriveStrategy driveStrategy;

        public Vehicle(DriveStrategy driveStrategy) {
            this.driveStrategy = java.util.Objects.requireNonNull(driveStrategy);
        }

        public void performDrive() {
            System.out.println("Vehicle using strategy: " + driveStrategy.getClass().getSimpleName());
            driveStrategy.drive();
        }
    }

    public static class SportsVehicle extends Vehicle {
        public SportsVehicle(DriveStrategy driveStrategy) {
            super(driveStrategy);
        }
    }

    public static class HybridVehicle extends Vehicle {
        public HybridVehicle(DriveStrategy driveStrategy) {
            super(driveStrategy);
        }
    }

    public static class GoodsVehicle extends Vehicle {
        public GoodsVehicle(DriveStrategy driveStrategy) {
            super(driveStrategy);
        }
    }
}
// ...existing code...