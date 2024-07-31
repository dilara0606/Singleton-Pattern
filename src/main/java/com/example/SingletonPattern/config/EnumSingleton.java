package com.example.SingletonPattern.config;

public enum EnumSingleton {
    INSTANCE;

    private final ConfigurationManager configManager;

    EnumSingleton() {
        configManager = ConfigurationManager.getInstance();
    }

    public ConfigurationManager getConfigManager() {
        return configManager;
    }
}
