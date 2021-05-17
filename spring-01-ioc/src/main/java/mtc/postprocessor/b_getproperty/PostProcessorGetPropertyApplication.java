package mtc.postprocessor.b_getproperty;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostProcessorGetPropertyApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "mtc.postprocessor.b_getproperty");
        ctx.close();
    }

}
