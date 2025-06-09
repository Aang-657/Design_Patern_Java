package Decorator;

// Main.java
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        //coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());
    }
}