package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableHystrixDashboard
//@EnableTurbine
@SpringBootApplication
//@EnableAutoConfiguration
//@EnableAdminServer
//@RestController
public class DemoApigwAdminApplication {

//    @RequestMapping("/")
//    public String home() {
//        return "forward:/hystrix";
//    }
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApigwAdminApplication.class, args);
	}
}
