package com.example.configservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerEurekaApplication.class, args);
	}

}
