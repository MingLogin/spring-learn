package mtc.basic_di.b_constructor;


import mtc.basic_di.b_constructor.bean.Cat;
import mtc.basic_di.b_constructor.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectByConstructorXmlApplication {
    
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-constructor.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);
    
        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
