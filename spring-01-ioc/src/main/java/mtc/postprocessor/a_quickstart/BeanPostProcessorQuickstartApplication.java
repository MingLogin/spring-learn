package mtc.postprocessor.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorQuickstartApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("mtc.postprocessor.a_quickstart");
        ctx.close();
    }
}
