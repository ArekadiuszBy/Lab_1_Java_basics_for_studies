package devices;

import com.company.Human;

import javax.management.InvalidAttributeValueException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Dictionary;

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

    public static Car sellCar(Car[] sellerGarage, String wantedCar, boolean hasBuyerSpace, Double buyerMoney, Double price) throws Exception {
        if (!hasBuyerSpace || buyerMoney < price) {
            System.out.println("!!! Exception (no money or no space) !!!");
            // throw new InvalidAttributeValueException();
            return null;
        }

        // I wanted to use sth like LINQ, but nevermind...
        var hasCar = false;
        int index = 0, carIndex = 0;
        for (var i : sellerGarage) {
            if (i.Name == wantedCar) {
                hasCar = true;
                carIndex = index;
            }

            index++;
        }

        if (!hasCar) {
            // throw new InvalidAttributeValueException();
            return null;
        }

        var car = sellerGarage[carIndex];

        sellerGarage[carIndex] = null;
        System.out.println("Transaction of the car was successful.");

        return car;
    }
}
