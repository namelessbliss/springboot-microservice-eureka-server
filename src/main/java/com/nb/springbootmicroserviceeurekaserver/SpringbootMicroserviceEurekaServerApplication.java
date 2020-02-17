package com.nb.springbootmicroserviceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootMicroserviceEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMicroserviceEurekaServerApplication.class, args);
    }

}
