package com.whitewolf.rakesh.week1.IntroductionToSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class Apple {
    void eatApple(){

        System.out.println("Eat Apple");
    }

    @PostConstruct
    void callThisBeforeBeanUsed(){
        System.out.println("Creating the Apple");
    }

    @PreDestroy
    void callThisBeforeBeanDestroyed(){
        System.out.println("Before bean destroyed");
    }
}
