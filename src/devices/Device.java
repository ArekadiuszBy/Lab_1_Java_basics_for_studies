package devices;

public abstract class Device {
    public String Name;
    public String Make;
    public String FromCountry;
    public boolean isOn = false;

    protected Device(String name, String make, String fromCountry) {
        Name = name;
        Make = make;
        FromCountry = fromCountry;
    }

    public String showClassToString() {
        return this.toString();
    }

    public abstract void turnOn();
}
