package kz.kalabay.jenkinsapitest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello from Aman Kalabay! \uD83C\uDF0D\n";
    }

}
