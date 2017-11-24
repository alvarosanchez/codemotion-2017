package es.codemotion.springcloudconfigserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigServerApplication {

	static void main(String[] args) {
		SpringApplication.run SpringCloudConfigServerApplication, args
	}
}
