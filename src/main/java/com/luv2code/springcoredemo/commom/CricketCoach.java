package com.luv2code.springcoredemo.commom;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("In doMyStartUpStuff()" + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("In doMyCleanUpStuff()" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }
}
