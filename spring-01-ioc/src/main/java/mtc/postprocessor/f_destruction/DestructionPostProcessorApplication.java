package mtc.postprocessor.f_destruction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DestructionPostProcessorApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "mtc.postprocessor.f_destruction");
        ctx.close();
    }
}
