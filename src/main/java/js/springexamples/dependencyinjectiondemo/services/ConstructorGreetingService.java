package js.springexamples.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO = "Hello - injected by constructor injected controller.";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
