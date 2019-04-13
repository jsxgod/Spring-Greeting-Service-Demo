package js.springexamples.dependencyinjectiondemo.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String language){

        switch (language){
            case "en":
                return new EnglishGreetingService(greetingRepository);
            case "es":
                return new SpanishGreetingService(greetingRepository);
            case "de":
                return new GermanGreetingService(greetingRepository);
            default:
                return new EnglishGreetingService(greetingRepository);
        }
    }
}
