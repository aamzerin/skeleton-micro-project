package io.aamzerin.micro.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("io.aamzerin.microservices.**.service")
public class SkeletonApp {

	public static void main(String[] args) {
		SpringApplication.run(SkeletonApp.class, args);
	}
	
}