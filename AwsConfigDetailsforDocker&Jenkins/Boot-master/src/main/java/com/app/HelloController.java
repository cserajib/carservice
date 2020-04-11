package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;;

@RestController
@SpringBootApplication
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!....Rajib here";
    }

    
    public static void  main(String args[]) {
    	SpringApplication.run(HelloController.class,args);
    }
}
