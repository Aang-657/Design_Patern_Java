package Adapter;

// Main.java
public class Main {
    public static void main(String[] args) {
        NewVendor vendor = new NewVendor();
        Adapter adapter = new Adapter(vendor);
        double cost = adapter.calculateAdaptedCost();
        System.out.println("Biaya pengiriman: $" + cost);
    }
}