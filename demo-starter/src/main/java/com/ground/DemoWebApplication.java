package com.ground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class DemoWebApplication {
    public static void main( String[] args ) {
        SpringApplication.run(DemoWebApplication.class, args);
        System.out.println(">>>>>>>>>>>>>>app is run >>>>>>>>>>>>>>>");
    }
}
