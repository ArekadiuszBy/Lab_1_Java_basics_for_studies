package devices;

import java.time.LocalDateTime;

public class Car {

    public final String Name, Make, FromCountry;
    public int weight;
    public LocalDateTime ManufactureDate;
    public int value;

    public Car(String name, String make, String fromCountry) {
        Name = name;
        Make = make;
        FromCountry = fromCountry;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
	// write your code here
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
}
