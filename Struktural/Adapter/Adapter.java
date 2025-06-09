package Adapter;

// Adapter.java
public class Adapter {
    private NewVendor vendor;

    public Adapter(NewVendor vendor) {
        this.vendor = vendor;
    }

    public double convertWeight() {
        return vendor.getWeight() * 0.453592; // Konversi pound ke kg
    }

    public double calculateAdaptedCost() {
        OldSystem system = new OldSystem();
        system.setWeightInKg(convertWeight());
        return system.calculateCost();
    }
}