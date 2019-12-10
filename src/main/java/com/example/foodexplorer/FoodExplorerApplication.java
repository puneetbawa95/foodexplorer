package com.example.foodexplorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FoodExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodExplorerApplication.class, args);
	}

}
