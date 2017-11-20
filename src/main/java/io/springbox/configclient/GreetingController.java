package io.springbox.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${greeting}")
    String greeting;

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public String greeter() {
        return String.format("%s World!", greetingService.getGreeting());
    }

}
