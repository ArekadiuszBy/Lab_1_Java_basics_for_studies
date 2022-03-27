package com.company;

public class Animal {

    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
    }

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void feed() {
        if(this.weight <= 0) {
            System.out.println("Zwierze nie żyje!");
        } else {
            this.weight += 0.5;
            System.out.println("Karmienie " + this.weight);
        }
    }

    public void takeForAWalk() {
        if(this.weight <= 0) {
            System.out.println("Zwierze nie żyje!");
        } else {
            this.weight -= 0.5;
            System.out.println("Spacer " + this.weight);
        }
    }

}
