package js.springexamples.dependencyinjectiondemo.config;

import js.springexamples.dependencyinjectiondemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfiguration {

    @Value("${js.user}")
    String user;

    @Value("${js.password}")
    String password;

    @Value("${js.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }
/*
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){

        return new PropertySourcesPlaceholderConfigurer();
    }
*/
}
