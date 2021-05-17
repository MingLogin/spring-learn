package mtc.basic_dl.f_lazylookup;

import mtc.basic_dl.f_lazylookup.bean.Cat;
import mtc.basic_dl.f_lazylookup.bean.Dog;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImmediatlyLookupApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        Dog dog;
        try {
            dog = ctx.getBean(Dog.class);
        } catch (NoSuchBeanDefinitionException e) {
            // 找不到Dog时手动创建
            dog = new Dog();
        }
        System.out.println(dog);
    }
}
