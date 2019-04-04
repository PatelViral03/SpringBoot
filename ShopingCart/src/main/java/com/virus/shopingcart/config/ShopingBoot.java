package com.virus.shopingcart.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages={"com.virus.shopincart.categories"})
@ComponentScan("com.virus.shopincart.categories.controller")
public class ShopingBoot extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
			SpringApplication.run(ShopingBoot.class, args);
	}
	
}
