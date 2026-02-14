package com.example.kodnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FirstProjectApplication.class, args);
		Os os = ac.getBean(Os.class);
		System.out.println(os.getName());
		
		Laptop lp = ac.getBean(Laptop.class);
		System.out.println(lp.getLapid());
		System.out.println(lp.getBrand());
		System.out.println(lp.getPrice());
	}

}

