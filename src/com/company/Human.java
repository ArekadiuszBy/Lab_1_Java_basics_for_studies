package com.company;

import devices.Car;

import java.time.LocalDateTime;

public class Human {

    private Car owner;
    private Double salary;

    public Human(Car car){
        this.owner = car;
        this.salary = 0d;
    }

    public static void main(String[] args) {
	// write your code here
    }

    public boolean canBuy() {
        if (this.salary == 0 || this.salary == null) {
            System.out.println("Brak przypisanej wypłaty");
            return false;
        }

        if (this.owner.value == 0) {
            System.out.println("Brak wartości auta");
            return false;
        }

        if (this.salary > owner.value){
            System.out.println("Kupiono za gotówkę");
            return true;
        } else if (this.salary*12 >= owner.value){
            System.out.println("Kupiono na kredyt");
            return true;
        }

        System.out.println("Rower");
        return false;
    }

    public Car getCar() {
        return this.owner;
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
