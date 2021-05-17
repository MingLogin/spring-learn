package mtc.basic_di.a_quickstart_set.config;


import mtc.basic_di.a_quickstart_set.bean.Person;
import mtc.basic_di.a_quickstart_set.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickstartInjectBySetConfiguration {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("test-person-anno-byset");
        person.setAge(18);
        return person;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("test-cat-anno");
        cat.setMaster(person());
        return cat;
    }

}
