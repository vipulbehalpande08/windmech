package com.vipulb.windmech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vipulb.windmech.app")
public class WindMechApplication {

	/*
	 * In case you want to deploy the application on external server
	 * Kindly  use SpringBootServletInitializer class and override configure(...) method
	 */
	public static void main(String[] args) {
		SpringApplication.run(WindMechApplication.class, args);
	}
}
