package com.example.SingletonPattern.config;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private final ConfigurationManager configManager;

    private ThreadSafeSingleton() {
        configManager = ConfigurationManager.getInstance();
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public ConfigurationManager getConfigManager() {
        return configManager;
    }
}
