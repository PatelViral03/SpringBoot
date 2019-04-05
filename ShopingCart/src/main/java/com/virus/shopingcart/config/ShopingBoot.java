package com.virus.shopingcart.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.virus.shopingcart.*"})
@EnableJpaRepositories("com.virus.shopingcart.*")
@EntityScan("com.virus.shopingcart.*")
@ComponentScan("com.virus.shopingcart.*")
@PropertySource("classpath:application.properties")
public class ShopingBoot extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
			SpringApplication.run(ShopingBoot.class, args);
	}
	
}
