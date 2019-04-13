package js.springexamples.dependencyinjectiondemo.services;

public class EnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public EnglishGreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
