package com.keepremeber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.security.AllPermission;

/**
 * Created by Mocha on 2017/6/25.
 */

@SpringBootApplication
@Configuration
public class Application {
    public static void main(String[] args) {
        System.out.println("keepremeber---start---");
        SpringApplication.run(Application.class, args);
    }

}
