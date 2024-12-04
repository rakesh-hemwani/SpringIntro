package com.whitewolf.rakesh.week1.IntroductionToSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringApplication implements CommandLineRunner {

//	@Autowired
//	Apple apple1;
//
//	@Autowired
//	Apple apple2;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringApplication.class, args);

		//Without Bean
////		Apple apple = new Apple();
////		apple.eatApple();
	}

	@Override
	public void run(String... args) throws Exception {
//		apple1.eatApple();
//		apple2.eatApple();
//
//		System.out.println(apple1.hashCode() + " " + apple2.hashCode());

		System.out.println(dbService.getData());

	}
}
