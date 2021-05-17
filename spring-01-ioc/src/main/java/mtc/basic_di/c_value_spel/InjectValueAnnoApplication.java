package mtc.basic_di.c_value_spel;


import mtc.basic_di.c_value_spel.bean.Black;

import mtc.basic_di.c_value_spel.bean.Blue;

import mtc.basic_di.c_value_spel.bean.Green;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("mtc.basic_di.c_value_spel.animals");
        Black black = ctx.getBean(Black.class);
        System.out.println("simple value : " + black);
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
//        Red red = ctx.getBean(Red.class);
//        System.out.println("properties value : " + red);

        Blue blue = ctx.getBean(Blue.class);
        System.out.println("use spel : " + blue);

        Green green = ctx.getBean(Green.class);
        System.out.println("use spel : " + green);
    }
}
