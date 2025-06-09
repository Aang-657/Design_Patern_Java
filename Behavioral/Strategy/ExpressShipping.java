package Strategy;

// ExpressShipping.java
public class ExpressShipping implements ShippingStrategy {
    public double calculateCost(double weight) {
        return weight * 2.5;
    }
}