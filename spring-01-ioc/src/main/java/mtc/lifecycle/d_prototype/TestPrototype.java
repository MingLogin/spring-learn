package mtc.lifecycle.d_prototype;



import mtc.lifecycle.d_prototype.bean.Pen1;
import mtc.lifecycle.d_prototype.config.PrototypeLifecycleConfiguration1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPrototype {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                PrototypeLifecycleConfiguration1.class);

        Pen1 pen = ctx.getBean(Pen1.class);
        ctx.getBeanFactory().destroyBean(pen);
        ctx.close();
    }
}
