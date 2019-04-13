package js.springexamples.dependencyinjectiondemo.controllers;


import js.springexamples.dependencyinjectiondemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.sayGreeting();
    }
}
