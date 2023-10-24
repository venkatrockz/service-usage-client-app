package com.utils.serviceusageclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.utils.serviceusageclientapp","com.utils.serviceusagepublisher"})
public class ServiceUsageClientAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceUsageClientAppApplication.class, args);
    }

}
