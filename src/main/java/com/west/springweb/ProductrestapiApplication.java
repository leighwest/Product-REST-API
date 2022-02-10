package com.west.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProductrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductrestapiApplication.class, args);
		System.getenv().forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});

		System.out.println(System.getenv("TEST"));
	}

}
