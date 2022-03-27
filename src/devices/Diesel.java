package devices;

public class Diesel extends Car {
    public Diesel(String name, String make, String fromCountry) {
        super(name, make, fromCountry);
    }

    @Override
    public void refuel() {
        System.out.println("Refuelling...");
        this.isTankFull = true;
    }
}
