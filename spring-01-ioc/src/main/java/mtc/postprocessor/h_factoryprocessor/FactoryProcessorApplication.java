package mtc.postprocessor.h_factoryprocessor;

import mtc.postprocessor.h_factoryprocessor.bean.Red;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryProcessorApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "mtc.postprocessor.h_factoryprocessor");
        Red red = ctx.getBean(Red.class);
        System.out.println(red);
    }
}
