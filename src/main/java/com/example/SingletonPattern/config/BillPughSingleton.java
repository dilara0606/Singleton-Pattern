package com.example.SingletonPattern.config;

public class BillPughSingleton {
    private final ConfigurationManager configManager;

    private BillPughSingleton() {
        configManager = ConfigurationManager.getInstance();
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public ConfigurationManager getConfigManager() {
        return configManager;
    }
}
