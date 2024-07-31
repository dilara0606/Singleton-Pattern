package com.example.SingletonPattern.config;

public class BasicSingleton {
    private static BasicSingleton instance;
    private final ConfigurationManager configManager;

    private BasicSingleton() {
        configManager = ConfigurationManager.getInstance();
    }

    public static synchronized BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }

    public ConfigurationManager getConfigManager() {
        return configManager;
    }
}
