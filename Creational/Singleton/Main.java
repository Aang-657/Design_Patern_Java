
// Main.java
public class Main {
    public static void main(String[] args) {
        ConfigManager config1 = ConfigManager.getInstance();
        ConfigManager config2 = ConfigManager.getInstance();

        config1.setConfig("http://newserver.com");
        System.out.println("Config 1: " + config1.getConfig()); // Sama dengan config2
        System.out.println("Config 2: " + config2.getConfig()); // Sama dengan config1
        System.out.println("Same instance: " + (config1 == config2)); // True
    }
}
