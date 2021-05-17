package mtc.annotation.b_di;

import mtc.annotation.b_di.bean.Person;
import mtc.annotation.b_di.config.AnnotationDIConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDIApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationDIConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
