package es.codemotion.springcloudconfigclient

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringCloudConfigClientApplication {

	static void main(String[] args) {
		SpringApplication.run SpringCloudConfigClientApplication, args
	}

	@Bean
	@RefreshScope
	ConferenceProperties conferenceTitleBean(@Value('${conference.title}') String conferenceTitle) {
		new ConferenceProperties(title: conferenceTitle)
	}
}
