package mtc.annotation.a_quickstart;

import mtc.annotation.a_quickstart.bean.Person;
import mtc.annotation.a_quickstart.config.QuickstartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplication {


    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
