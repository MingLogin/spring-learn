package mtc.basic_di.d_autowired;

import mtc.basic_di.d_autowired.bean.Cat;
import mtc.basic_di.d_autowired.bean.Dog;
import mtc.basic_di.d_autowired.config.InjectComplexFieldConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredApplication {

    public static void main(String[] args) throws Exception {
        // ApplicationContext ctx = new AnnotationConfigApplicationContext("mtc.basic_di.d_autowired.animals");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}