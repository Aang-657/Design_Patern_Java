package Decorator;
// MilkDecorator.java
public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getCost() {
        return coffee.getCost() + 1.5;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Susu";
    }
}