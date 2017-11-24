package es.codemotion.springclouddiscoveryclient2

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("my-server")
interface MyServerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String doSomething()
    
}
