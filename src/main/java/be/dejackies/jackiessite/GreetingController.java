package be.dejackies.jackiessite;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greetings")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}