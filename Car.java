public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine Started");
    }

    protected void runEngine() {
        System.out.println("Engine Running");
    }

    public void drive() {
        System.out.println("Car in Drive Mode. Type of car -> " + getClass().getSimpleName());
        runEngine();
    }


}
