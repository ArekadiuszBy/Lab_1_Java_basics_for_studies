package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;

public class Human {

    private Car car;
    private Phone phone;
    private Animal animal;
    private Double salary;
    public Double cash;
    public boolean hasAnimal;
    public boolean hasCar;
    public boolean hasPhone;
    public boolean wantsAnimal;
    public boolean wantsCar;
    public boolean wantsPhone;
    public boolean wantsHuman;

    public Human(){
        this.cash = 1300d;
        this.salary = 1300d;
    }

    public Human(Car car){
        this.car = car;
        this.salary = 0d;
    }

    public Human(Phone phone){
        this.phone = new Phone("Samsung", "Note", 1200d);
        this.hasPhone = true;
    }

    public Human(Animal animal){
        this.hasAnimal = true;
    }

    public boolean canBuy() {
        if (this.salary == 0 || this.salary == null) {
            System.out.println("Brak przypisanej wypłaty");
            return false;
        }

        if (this.car.value == 0) {
            System.out.println("Brak wartości auta");
            return false;
        }

        if (this.salary > car.value){
            System.out.println("Kupiono za gotówkę");
            return true;
        } else if (this.salary*12 >= car.value){
            System.out.println("Kupiono na kredyt");
            return true;
        }

        System.out.println("Rower");
        return false;
    }

    public boolean canBuyPhone(Human seller) {
        if (this.cash == 0 || this.cash == null) {
            System.out.println("Brak kasy");
            return false;
        }

        if (this.cash > seller.phone.Value){
            return true;
        }

        return false;
    }

    public Car getCar() {
        return this.car;
    }

    public LocalDateTime getSalary() {
        return LocalDateTime.now();
    }

    public Double setSalary(Double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("System księgowy uaktualniony");
            System.out.println("Pania Hania z Kadrowania");
            System.out.println("Zus i Us wiedzą wszystko");
            System.out.println("Twoja wypłata po podatkach to: Miska ryżu i " + Math.round(this.salary - 10) + "zł");
        }

        return null;
    }
}
