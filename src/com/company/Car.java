package com.company;

import java.time.LocalDateTime;

public class Car {

    public final String Name, Make, FromCountry;
    public int weight;
    public LocalDateTime ManufactureDate;

    public Car(String name, String make, String fromCountry) {
        Name = name;
        Make = make;
        FromCountry = fromCountry;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
