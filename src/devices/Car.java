package devices;

import java.time.LocalDateTime;

public abstract class Car extends Device {

    public int weight;
    public LocalDateTime ManufactureDate;
    public int value;
    public boolean isTankFull;

    public Car(String name, String make, String fromCountry) {
        super(name, make, fromCountry);
        Name = name;
        Make = make;
        FromCountry = fromCountry;
    }

    public abstract void refuel();

    public void setValue(int value) {
        this.value = value;
    }

    @Override public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null
                || this.getClass() != obj.getClass())
            return false;

        var car = (Car)obj; // type casting object to the

        return this.Make.equals(car.Make)
                && this.Name.equals(car.Name)
                && this.FromCountry.equals(car.FromCountry);
    }


    @Override
    public void turnOn() {
        this.isOn = true;
    }
}
