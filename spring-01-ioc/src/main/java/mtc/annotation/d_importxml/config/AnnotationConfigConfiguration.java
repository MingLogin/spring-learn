package mtc.annotation.d_importxml.config;

import mtc.basic_dl.a_quickstart_byname.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigConfiguration {
    
    @Bean
    public Person person() {
        return new Person();
    }
    
}
