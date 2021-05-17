package mtc.bean.a_type;

import mtc.bean.a_type.bean.Toy;
import mtc.bean.a_type.config.BeanTypeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTypeAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        System.out.println(ctx.getBean("toyFactory"));// 输出：Toy{name='ball'}
        System.out.println(ctx.getBean("&toyFactory"));  //mtc.animals.a_type.animals.ToyFactoryBean@1b68b9a4
        //Toy toy = ctx.getBean(Toy.class);
//        System.out.println(toy);
    }
}
