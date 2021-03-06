package mtc.postprocessor.d_factorybean;

import mtc.postprocessor.d_factorybean.bean.Egg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanPostProcessorApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "mtc.postprocessor.d_factorybean");
        Egg egg = ctx.getBean(Egg.class);
        System.out.println(egg);
        ctx.close();
    }
}
