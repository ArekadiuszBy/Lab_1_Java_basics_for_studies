package devices;

public class Phone extends Device  {

    protected Phone(String name, String make, String fromCountry) {
        super(name, make, fromCountry);
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }
}
