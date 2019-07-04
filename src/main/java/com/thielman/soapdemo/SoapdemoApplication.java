package com.thielman.soapdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapdemoApplication {

    // Checkout http://localhost:8080/ws/countries.wsdl
    public static void main(String[] args) {
        SpringApplication.run(SoapdemoApplication.class, args);
    }

}
