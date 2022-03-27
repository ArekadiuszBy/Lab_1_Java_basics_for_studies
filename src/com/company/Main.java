package com.company;

import devices.Car;

import java.time.LocalDateTime;

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
        var car2 = new Car("Forester", "Subaru", "Japan");
        var human = new Human(car);

        var owner = human.getCar();
        owner.ManufactureDate = LocalDateTime.now();

        System.out.println("Country " + owner.FromCountry + " Make " + owner.Make + " Name "
                + owner.Name + " Day of year " + owner.ManufactureDate.getDayOfYear() + " Weight " + owner.weight);

        // Zad 3 + 4
        System.out.println("\n Zad 3 + 4");

        human.setSalary(11.99);
        human.getSalary();

        // Zad 5
        System.out.println("\n Zad 5");
        human.canBuy();
        car.setValue(100);
        human.canBuy();

        // Zad 6
        System.out.println("\n Zad 6");
        car2.setValue(100);
        if (car == car2) {
            System.out.println(" == Te same auta");
        } else {
            System.out.println(" == Nie te same auta");
        }

        if (car.equals(car2)) {
            System.out.println(" equals Te same auta");
        } else {
            System.out.println(" Override equals Nie te same auta");
        }

        System.out.println(car);
        System.out.println(car2);

        // Zad 7
        System.out.println("\n Zad 7");

        // Zad 8
        System.out.println("\n Zad 8");

    }
}
