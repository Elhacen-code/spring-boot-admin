package com.admin.client.springbootadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringbootadminclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootadminclientApplication.class, args);
	}

}
