package com.company;

public class Main {

    public static void main(String[] args) {
        var animal = new Animal("Kot", 5d);

        System.out.println("Waga początkowa: " + animal.getWeight());
        for (int i=0; i<10; i++){
            animal.takeForAWalk();
        }
    }
}
