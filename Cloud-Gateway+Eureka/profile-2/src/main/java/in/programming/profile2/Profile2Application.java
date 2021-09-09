package in.programming.profile2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Profile2Application {

	public static void main(String[] args) {
		SpringApplication.run(Profile2Application.class, args);
	}

}
