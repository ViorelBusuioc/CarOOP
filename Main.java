public class Main {

    public static void main(String[] args) {

        Car car = new ElectricCar("Tesla Model S",1000.00,750);
        runRace(car);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
