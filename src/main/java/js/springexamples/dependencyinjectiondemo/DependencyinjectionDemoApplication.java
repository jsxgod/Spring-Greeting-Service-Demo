package js.springexamples.dependencyinjectiondemo;

import js.springexamples.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import js.springexamples.dependencyinjectiondemo.controllers.MyController;
import js.springexamples.dependencyinjectiondemo.controllers.PropertyInjectedController;
import js.springexamples.dependencyinjectiondemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyinjectionDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        System.out.println(controller.greet());
    }

}
