package mtc.bean.c_instantiate;


import mtc.bean.c_instantiate.bean.Car;
import mtc.bean.c_instantiate.bean.CarStaticFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiateXmlApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });
        System.out.println(ctx.getBean(CarStaticFactory.class));
    }
}
