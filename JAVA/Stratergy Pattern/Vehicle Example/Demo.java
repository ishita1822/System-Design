public class Demo {
    public static void main(String[] args) {
        // Vehicle sportsVehicle = new SportsVehicle(new SportDriveStrategy());
        // sportsVehicle.performDrive();

        // Vehicle goodsVehicle = new GoodsVehicle(new EcoDriveStrategy());
        // goodsVehicle.performDrive();

        // Vehicle hybridVehicle = new HybridVehicle(new HybridDriveStrategy());
        // hybridVehicle.performDrive();

        // Vehicle hybridVehicle = new HybridVehicle(new NormalDrive());
        // hybridVehicle.performDrive();

        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.performDrive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.performDrive();

        vehicle = new HybridVehicle(new EVDrive());
        vehicle.performDrive();

        vehicle = new GoodsVehicle(new SportsDrive());
        vehicle.performDrive();

    }
}
