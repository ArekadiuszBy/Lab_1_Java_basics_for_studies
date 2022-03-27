package com.company;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var animal = new Animal("Kot", 5d);

        // Zad 1
        System.out.println("Zad 1");
        System.out.println("Waga początkowa: " + animal.getWeight());
        for (int i=0; i<15; i++){
            animal.takeForAWalk(i);
        }

        // Zad 2
        System.out.println("\n Zad 2");
        var car = new Car("Forester", "Subaru", "Japan");
        var human = new Human(car);

        var owner = human.owner;
        owner.ManufactureDate = LocalDateTime.now();

        System.out.println("Country " + owner.FromCountry + " Make " + owner.Make + " Name "
                + owner.Name + " Day of year " + owner.ManufactureDate.getDayOfYear() + " Weight " + owner.weight);

        // Zad 3
        System.out.println("\n Zad 3");

        human.setSalary(11.99);
        human.getSalary();

        // Zad 4
        System.out.println("\n Zad 4");

        // Zad 5
        System.out.println("\n Zad 5");

        // Zad 6
        System.out.println("\n Zad 6");

        // Zad 7
        System.out.println("\n Zad 7");

        // Zad 8
        System.out.println("\n Zad 8");

    }
}
