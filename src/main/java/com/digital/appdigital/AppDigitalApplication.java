package com.digital.appdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppDigitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDigitalApplication.class, args);
    }

}
