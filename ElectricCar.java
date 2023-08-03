import java.util.Scanner;

public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Car ready to go");
    }

    @Override
    public void drive() {
        super.drive();
        Scanner s = new Scanner(System.in);
        System.out.println("Car in Drive Mode\nAuto Pilot engaged\nPlease select destination: ");
        String destination = s.nextLine();
        System.out.println("Calculating route to " + destination + "...");
        System.out.println("The car is driving to the destination");

    }
}
