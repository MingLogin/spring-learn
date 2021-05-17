package mtc.definition.b_registry;


import mtc.definition.b_registry.bean.Person;
import mtc.definition.b_registry.config.BeanDefinitionRegistryConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionRegistryApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                BeanDefinitionRegistryConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
