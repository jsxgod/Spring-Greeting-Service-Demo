package js.springexamples.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {


    public static final String HELLO = "Hello - injected by setter injected controller.";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
