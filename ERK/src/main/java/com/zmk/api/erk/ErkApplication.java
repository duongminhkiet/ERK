package com.zmk.api.erk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErkApplication {
	public static void main(String[] args) {
		SpringApplication.run(ErkApplication.class, args);
	}
}