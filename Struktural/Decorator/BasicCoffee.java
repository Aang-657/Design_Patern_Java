package Decorator;

// BasicCoffee.java
public class BasicCoffee implements Coffee {
    public double getCost() {
        return 5.0;
    }

    public String getDescription() {
        return "Kopi Dasar";
    }
}