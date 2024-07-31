package com.example.SingletonPattern.config;


public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;
    private final ConfigurationManager configManager;

    private DoubleCheckedLockingSingleton() {
        configManager = ConfigurationManager.getInstance();
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    public ConfigurationManager getConfigManager() {
        return configManager;
    }
}
