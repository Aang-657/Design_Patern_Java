package Strategy;

// Main.java
public class Main {
    public static void main(String[] args) {
        ShippingContext context = new ShippingContext();
        context.setStrategy(new StandardShipping());
        System.out.println("Biaya Standar (5 kg): $" + context.calculateCost(5.0));

        context.setStrategy(new ExpressShipping());
        System.out.println("Biaya Ekspres (5 kg): $" + context.calculateCost(5.0));
    }
}