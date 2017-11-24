package es.codemotion.springclouddiscoveryclient1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SpringCloudDiscoveryClient1Application {

	static void main(String[] args) {
		SpringApplication.run SpringCloudDiscoveryClient1Application, args
	}

}
