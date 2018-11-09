package com.github.jenphyjohn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author JenphyJohn
 */
@EnableEurekaServer
@SpringBootApplication
public class JoineEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoineEurekaApplication.class, args);
	}
}
