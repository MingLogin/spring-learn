package mtc.basic_di.f_jsr330.config;



import mtc.basic_di.f_jsr330.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("mtc.basic_di.f_jsr330.bean")
public class JSR330Configuration {

    @Bean
    public Person master() {

        return new Person("master");
    }

    @Bean
    public Person admin() {
        return new Person("admin");
    }

}
