package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AlibabaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaProviderApplication.class, args);
    }

}
