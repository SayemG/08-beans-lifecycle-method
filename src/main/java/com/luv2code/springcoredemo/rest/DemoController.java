package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.commom.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // constructor injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkOut();
    }

}
