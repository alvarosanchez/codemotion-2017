package es.codemotion.springcloudconfigclient

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Value('${global.greeting}')
    String globalGreeting

    @Value('${conference.title}')
    String conferenceTitle

    @Autowired
    ConferenceProperties conferenceProperties

    @GetMapping("/1")
    String index() {
        return "${globalGreeting}, ${conferenceTitle}\n"
    }

    @GetMapping("/2")
    String refreshScope() {
        return "${globalGreeting}, ${conferenceProperties.title}\n"
    }

    @GetMapping("/3")
    String autowiredParameter(@Value('${conference.title}') String conferenceTitle) {
        return "${globalGreeting}, ${conferenceTitle}\n"
    }

}
