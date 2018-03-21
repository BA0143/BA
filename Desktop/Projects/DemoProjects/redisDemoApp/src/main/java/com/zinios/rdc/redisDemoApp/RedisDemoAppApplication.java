package com.zinios.rdc.redisDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisDemoAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisDemoAppApplication.class, args);
	}
}
