package com.example.SingletonPattern.config;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    private final ConfigurationManager configManager;

    private SynchronizedSingleton() {
        configManager = ConfigurationManager.getInstance();
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

    public ConfigurationManager getConfigManager() {
        return configManager;
    }
}