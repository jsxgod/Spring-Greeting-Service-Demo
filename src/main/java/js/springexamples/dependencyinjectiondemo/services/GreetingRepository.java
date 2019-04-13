package js.springexamples.dependencyinjectiondemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepository implements IGreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "English Greeting";
    }

    @Override
    public String getGermanGreeting() {
        return "German Greeting";
    }

    @Override
    public String getSpanishGreeting() {
        return "Spanish Greeting";
    }
}
