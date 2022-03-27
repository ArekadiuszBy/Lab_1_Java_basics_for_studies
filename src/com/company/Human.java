package com.company;

import java.time.LocalDateTime;

public class Human {

    public Car owner;
    private Double salary;

    public Human(Car car){
        this.owner = car;
    }

    public static void main(String[] args) {
	// write your code here
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
