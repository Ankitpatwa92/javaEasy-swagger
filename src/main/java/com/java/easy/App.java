package com.java.easy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

/**
 * App Starter!
 *
 */
@SpringBootApplication
@RestController
public class App extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
 
}
