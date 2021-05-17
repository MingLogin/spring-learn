package mtc.basic_di.f_jsr330;


import mtc.basic_di.f_jsr330.bean.Cat;
import mtc.basic_di.f_jsr330.config.JSR330Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JSR330Application {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JSR330Configuration.class);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
    }
}
