package Decorator;
// SugarDecorator.java
public class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Gula";
    }
}