package br.com.petbytes.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PetBytesEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetBytesEurekaserverApplication.class, args);
	}

}
