package com.capgroup.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Capgroup1Application {

	public static void main(String[] args) {
		SpringApplication.run(Capgroup1Application.class, args);
	}
}
