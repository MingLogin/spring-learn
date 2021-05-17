package mtc.annotation.a_quickstart.config;

import mtc.annotation.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickstartConfiguration {

    @Bean(name = "aaa")
    public Person person() {
        return new Person();
    }
}
