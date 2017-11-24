package es.codemotion.springclouddiscoveryclient2

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class SpringCloudDiscoveryClient2Application {

	static void main(String[] args) {
		SpringApplication.run SpringCloudDiscoveryClient2Application, args
	}
}
