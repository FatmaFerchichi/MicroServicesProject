package tn.esprit.discoverysv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoverySvApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverySvApplication.class, args);
	}

}
