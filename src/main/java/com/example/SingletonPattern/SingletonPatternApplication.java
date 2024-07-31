package com.example.SingletonPattern;

import com.example.SingletonPattern.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonPatternApplication.class, args);

		// Basic Singleton
		ConfigurationManager basicConfigManager = BasicSingleton.getInstance().getConfigManager();
		System.out.println("Basic Singleton Configuration: " + basicConfigManager.getConfiguration());

		// Synchronized Singleton
		ConfigurationManager syncConfigManager = SynchronizedSingleton.getInstance().getConfigManager();
		System.out.println("Synchronized Singleton Configuration: " + syncConfigManager.getConfiguration());

		// Double-Checked Locking Singleton
		ConfigurationManager dclConfigManager = DoubleCheckedLockingSingleton.getInstance().getConfigManager();
		System.out.println("Double-Checked Locking Singleton Configuration: " + dclConfigManager.getConfiguration());

		// Bill Pugh Singleton
		ConfigurationManager billPughConfigManager = BillPughSingleton.getInstance().getConfigManager();
		System.out.println("Bill Pugh Singleton Configuration: " + billPughConfigManager.getConfiguration());

		// Enum Singleton
		ConfigurationManager enumConfigManager = EnumSingleton.INSTANCE.getConfigManager();
		System.out.println("Enum Singleton Configuration: " + enumConfigManager.getConfiguration());

		System.out.println("Thread Safe Singleton Configuration: " + ThreadSafeSingleton.getInstance().getConfigManager().getConfiguration());

		// Update Configuration
		basicConfigManager.setConfiguration("Updated Configuration");

		// Print configurations after update
		System.out.println("Basic Singleton Updated Configuration: " + BasicSingleton.getInstance().getConfigManager().getConfiguration());
		System.out.println("Synchronized Singleton Updated Configuration: " + SynchronizedSingleton.getInstance().getConfigManager().getConfiguration());
		System.out.println("Double-Checked Locking Singleton Updated Configuration: " + DoubleCheckedLockingSingleton.getInstance().getConfigManager().getConfiguration());
		System.out.println("Bill Pugh Singleton Updated Configuration: " + BillPughSingleton.getInstance().getConfigManager().getConfiguration());
		System.out.println("Enum Singleton Updated Configuration: " + EnumSingleton.INSTANCE.getConfigManager().getConfiguration());
		System.out.println("Thread Safe Singleton Updated Configuration: " + ThreadSafeSingleton.getInstance().getConfigManager().getConfiguration());
	}

}
