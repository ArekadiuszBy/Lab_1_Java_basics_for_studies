package creatures;

import com.company.Human;
import com.company.Salleable;

public abstract class Animal implements Salleable, Feedable {

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

    public void takeForAWalk(int i) {
        if(this.weight <= 0) {
            System.out.println("Zwierze nie żyje!");
        } else {
            this.weight -= 0.5;
            if (i < 2 || i > 8)
                System.out.println("Spacer " + this.weight);
        }
    }

    // Phone
    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (seller.hasAnimal || seller.hasCar || seller.hasPhone || !buyer.wantsHuman) {
            if (buyer.canBuyPhone(seller) && buyer.wantsPhone) {
                seller.cash += buyer.cash;
                buyer.cash -= seller.cash;
                return true;
            }
        }

        return false;

    }
}
