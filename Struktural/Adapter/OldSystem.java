package Adapter;

// OldSystem.java
public class OldSystem {
    private double weightInKg;

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double calculateCost() {
        return weightInKg * 2.5; // Contoh: $2.5 per kg
    }
}