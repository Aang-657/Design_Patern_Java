package Singleton;

public class ConfigManager {
    private static ConfigManager instance;
    private String serverUrl = "http://example.com";

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getConfig() {
        return serverUrl;
    }

    public void setConfig(String url) {
        this.serverUrl = url;
    }
}