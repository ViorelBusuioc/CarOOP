public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Wait for Oil to reach the optimal temp");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Slowly release the clutch to start moving");
    }
}
