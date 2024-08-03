package com.librarymanager.DiscorveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscorveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscorveryServerApplication.class, args);
	}

}
