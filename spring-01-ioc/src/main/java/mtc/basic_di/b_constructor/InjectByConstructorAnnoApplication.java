package mtc.basic_di.b_constructor;


import mtc.basic_di.b_constructor.bean.Cat;
import mtc.basic_di.b_constructor.bean.Person;
import mtc.basic_di.b_constructor.config.InjectByConstructorConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectByConstructorAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(InjectByConstructorConfiguration.class);
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);
    
        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
