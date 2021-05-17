package mtc.annotation.c_scan;

import mtc.annotation.c_scan.bean.Person;
import mtc.annotation.c_scan.config.ComponentScanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class ComponentScanApplication {

    public static void main(String[] args) {

        //ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        ApplicationContext ctx = new AnnotationConfigApplicationContext("mtc.annotation.c_scan.animals");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);

    }
}
