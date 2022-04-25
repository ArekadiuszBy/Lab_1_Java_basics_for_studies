package devices;

import com.company.Human;

import javax.management.InvalidAttributeValueException;
import java.security.InvalidParameterException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

class TransactionData {
    public String seller;
    public String buyer;
    public double price;
    public LocalDateTime sellDate;
}

public abstract class Car extends Device {

    private String currentOwner;
    private String previousOwner;
    public int weight;
    public LocalDateTime ManufactureDate;
    public int value;
    public boolean isTankFull;
    public List<String> owners;
    public List<TransactionData> infos;

    private void updateCurrentTransactionsData(String seller, String buyer, double price, LocalDateTime sellDate)
    {
        var transactionData = new TransactionData();
        transactionData.seller = seller;
        transactionData.buyer = buyer;
        transactionData.price = price;
        transactionData.sellDate = sellDate;
        this.infos.add(transactionData);
    }

    private List<TransactionData> getCurrentTransactionsData()
    {
        return this.infos;
    }

    public String getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner() {
          this.currentOwner = this.owners.get(this.owners.size() - 1);
    }

    public String getPreviousOwner() {
        return this.owners.get(this.owners.size() - 2);
    }

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }


    public Car(String name, String make, String fromCountry) {
        super(name, make, fromCountry);
        Name = name;
        Make = make;
        FromCountry = fromCountry;
    }

    public abstract void refuel();

    public void setValue(int value) {
        this.value = value;
    }

    @Override public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null
                || this.getClass() != obj.getClass())
            return false;

        var car = (Car)obj; // type casting object to the

        return this.Make.equals(car.Make)
                && this.Name.equals(car.Name)
                && this.FromCountry.equals(car.FromCountry);
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    public Car sellCar(Car[] sellerGarage, String wantedCar, boolean hasBuyerSpace, Double buyerMoney, Double price, String currentOwnerToCheck, String newOwner) throws Exception {
        if (!hasBuyerSpace || buyerMoney < price) {
            System.out.println("!!! Exception (no money or no space) !!!");
            // throw new InvalidAttributeValueException();
            return null;
        }

        if (this.owners != null) {
            setCurrentOwner();
            var currentOwner = getCurrentOwner();
            if (!currentOwnerToCheck.equals(currentOwner)) {
                System.out.println("FAKE SELLER (i pietruszka)");
//            throw new InvalidParameterException();
                } else {
                System.out.println("SELLER OKAY");
            }
        } else {
            System.out.println("You gonna be first owner <3");
        }


        // I wanted to use sth like LINQ, but nevermind...
        var hasCar = false;
        int index = 0, carIndex = 0;
        for (var i : sellerGarage) {
            if (i != null && i.Name == wantedCar) {
                hasCar = true;
                carIndex = index;
            }

            index++;
            if (!hasCar) {
                // throw new InvalidAttributeValueException();
                return null;
            }
        }

        var car = sellerGarage[carIndex];
        sellerGarage[carIndex] = null;

        if (owners != null) {
            var addedOwners = owners;
            addedOwners.add(newOwner);
            this.setOwners(addedOwners);
        }
        System.out.println("Transaction of the car was successful.");

        var transactionData = new TransactionData();
        transactionData.buyer = "Aaa";
        transactionData.seller = "Bbb";
        transactionData.sellDate = LocalDateTime.now();
        transactionData.price = 111d;

        var infos = new ArrayList<TransactionData>();
        infos.add(transactionData);
        infos.add(transactionData);
        infos.add(transactionData);
        this.infos = infos;

        updateCurrentTransactionsData(this.currentOwner, newOwner, price, LocalDateTime.now());
        var list = getCurrentTransactionsData();
        for (var object : list) {
            System.out.println("Objects // price: " + object.seller + ", seller: " + object.buyer + ", Buyer: " + object.price + ", Year: " + object.sellDate.getYear());
        }

        return car;
    }

    public boolean isCarSoldForRightPerson(String previousOwner, String currentOwner) {
        if (this.owners != null && this.currentOwner != null) {
            var previousOwnerTemp = getPreviousOwner();
            setCurrentOwner();
            var currentOwnerTemp = getCurrentOwner();
            if (previousOwner.equals(previousOwnerTemp) && currentOwner.equals(currentOwnerTemp)) {
                System.out.println("Transaction is verified. Everything is fine.");
                return true;
            } else {
                System.out.println("Something is not fine.");
                return false;
            }
        }
        return false;
    }
}
