package es.codemotion.springclouddiscoveryclient2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Autowired
    DiscoveryClient discoveryClient

    @Autowired
    MyServerClient myServerClient

    @GetMapping("/")
    String index() {
        ServiceInstance myServer = discoveryClient.getInstances('my-server').first()

        println "http://${myServer.host}:${myServer.port}"
        return "Manually we got this response from http://${myServer.host}:${myServer.port}:" + new URL("http://${myServer.host}:${myServer.port}").text
    }

    @GetMapping("/feign")
    String feign() {
        return "Using Feign we got this response: ${myServerClient.doSomething()}"
    }

}
