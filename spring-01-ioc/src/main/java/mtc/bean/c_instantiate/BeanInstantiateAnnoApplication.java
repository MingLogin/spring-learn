package mtc.bean.c_instantiate;


import mtc.bean.c_instantiate.bean.Car;
import mtc.bean.c_instantiate.bean.CarInstanceFactory;
import mtc.bean.c_instantiate.bean.CarStaticFactory;
import mtc.bean.c_instantiate.config.BeanInstantiateConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanInstantiateAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanInstantiateConfiguration.class);
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });
        //System.out.println(ctx.getBean(CarInstanceFactory.class).getCar());
    }

}
