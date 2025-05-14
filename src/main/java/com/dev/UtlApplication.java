package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtlApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtlApplication.class, args);
		System.out.println("------------------------------------------------------------------\n" +
				"UTIL\n" +
				"------------------------------------------------------------------");
	}

}
