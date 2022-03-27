package devices;

public class LPG extends Car {
    public LPG(String name, String make, String fromCountry) {
        super(name, make, fromCountry);
    }

    @Override
    public void refuel() {
        System.out.println("Refuelling...");
        this.isTankFull = true;
    }
}
