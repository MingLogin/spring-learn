package mtc.postprocessor.g_mergedefinition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MergeDefinitionPostProcessorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "mtc.postprocessor.g_mergedefinition");
        ctx.close();
    }
}
