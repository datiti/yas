package com.datiti.yas.yaseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YasEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(YasEurekaApplication.class, args);
	}
}
