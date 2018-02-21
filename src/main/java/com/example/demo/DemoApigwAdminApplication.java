package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
//@EnableAutoConfiguration
@EnableAdminServer
public class DemoApigwAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApigwAdminApplication.class, args);
	}
}
