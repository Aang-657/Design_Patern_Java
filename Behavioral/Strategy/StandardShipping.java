package Strategy;

// StandardShipping.java
public class StandardShipping implements ShippingStrategy {
    public double calculateCost(double weight) {
        return weight * 1.0;
    }
}
