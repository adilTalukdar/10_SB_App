package com.adil.config;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Configuration;

import com.adil.security.AppSecurity;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	@BeanProperty
	public AppSecurity getInstance() {
		return new AppSecurity();
	}
}
