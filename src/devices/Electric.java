package devices;

public class Electric extends Car {
    public Electric(String name, String make, String fromCountry) {
        super(name, make, fromCountry);
    }

    @Override
    public void refuel() {
        System.out.println("Refuelling...");
        this.isTankFull = true;
    }
}
