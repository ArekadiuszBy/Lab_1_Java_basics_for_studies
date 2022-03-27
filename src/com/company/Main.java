package com.company;

import creatures.Animal;
import devices.Car;
import devices.Diesel;
import devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var animal = new Animal("Kot", 5d) {
            @Override
            public void feed(double foodWeight) {
                while (foodWeight > 0){
                    this.feed();
                    foodWeight -= 0.5;
                }
            }
        };

        // Zad 1
        System.out.println("Zad 1");
        System.out.println("Waga początkowa: " + animal.getWeight());
        for (int i=0; i<15; i++){
            animal.takeForAWalk(i);
        }

        // Zad 2
        System.out.println("\n Zad 2");
        var car = new Car("Forester", "Subaru", "Japan") {
            @Override
            public void refuel() {
                isTankFull = true;
            }
        };
        var car2 = new Car("Forester", "Subaru", "Japan") {
            @Override
            public void refuel() {
                isTankFull = true;
            }
        };
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

        // == doesn't work when we've got abstract classes
//        if (car == car2) {
//            System.out.println(" == Te same auta");
//        } else {
//            System.out.println(" == Nie te same auta");
//        }

        if (car.equals(car2)) {
            System.out.println(" equals Te same auta");
        } else {
            System.out.println(" Override equals Nie te same auta");
        }

        System.out.println(car);
        System.out.println(car2);

        // Inheritance
        System.out.println("\n\n\n Inheritance");

        // Zad 7
        System.out.println("\n Zad 7");
        car.turnOn();
        System.out.println("Is car running: " + (car.isOn ? "Yes" : "No") + ",\nis car2 running: " + (car2.isOn ? "Yes" : "No"));

        // Zad 8
        System.out.println("\n Zad 8");

        var phone = new Phone("99", "DaPhone", 1200d);
        var humanWithPhone = new Human(phone);
        humanWithPhone.cash = -500d;
        var buyer = new Human();

        buyer.wantsPhone = true;
        buyer.cash = 1300d;

        var animalHuman = new Animal("Człowiek", 70.0) {
            @Override
            public void feed(double foodWeight) {
                while (foodWeight > 0){
                    this.feed();
                    foodWeight -= 0.5;
                }
            }
        };

        System.out.println("Kasa sprzedającego: " + humanWithPhone.cash + " \nKasa kupującego: " + buyer.cash);

        var transakcja = animalHuman.sell(humanWithPhone, buyer, 1d);

        if (transakcja) {
            System.out.println("Transakcja udana.");
            System.out.println("Kasa sprzedającego po sprzedaży: " + humanWithPhone.cash + " \nKasa kupującego po kupnie: " + buyer.cash);
            System.out.println(" \nTransakcja udana. \n");
        } else {
            System.out.println("Transakcja nieudana.");
        }

        // Zad 9
        System.out.println("\n Zad 9");
        animal.feed(2);


        // Zad 10
        System.out.println("\n Zad 10");

        System.out.println("Phone updating..");
        phone.installAnnApp("ArekApp", 99, "arek.com");
        phone.installAnnApp(new ArrayList<>(){{ add("1.com"); add("2.com"); add("3.com");  }});
        try {
            phone.installAnnApp(new URL("https://ArekDoZadankas.pl"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        phone.getAllData();

        System.out.println("Is diesel tank full? " + car.isTankFull);
        System.out.println("Refuelling... ");
        car.refuel();
        System.out.println("Is diesel tank full? " + car.isTankFull);

        // Add Diesel car

        var diesel = new Diesel("Golf", "Volksvagen", "Reich");
        System.out.println("\n Is tank full? " + diesel.isTankFull);
        diesel.refuel();
        System.out.println("Is tank full? " + diesel.isTankFull);

        // Arrays & collections
        System.out.println("\n\n\n Inheritance");

        // Zad 11
        System.out.println("\n Zad 11");

        // Zad 12
        System.out.println("\n Zad 12");

        // Zad 13
        System.out.println("\n Zad 13");

    }
}
