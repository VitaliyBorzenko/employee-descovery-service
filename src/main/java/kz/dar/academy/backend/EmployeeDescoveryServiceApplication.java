package kz.dar.academy.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EmployeeDescoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDescoveryServiceApplication.class, args);
	}

}
