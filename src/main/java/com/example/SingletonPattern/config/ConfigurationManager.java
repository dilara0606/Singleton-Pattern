package com.example.SingletonPattern.config;

public class ConfigurationManager {
    private String configuration;

    private ConfigurationManager() {
        this.configuration = "Default Configuration";
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    private static class SingletonHelper {
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }

    public static ConfigurationManager getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
