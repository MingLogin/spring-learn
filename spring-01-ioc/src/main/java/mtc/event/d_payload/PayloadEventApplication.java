package mtc.event.d_payload;

import mtc.basic_di.a_quickstart_set.bean.Person;
import mtc.event.d_payload.component.PayloadIntegerApplicationListener;
import mtc.event.d_payload.component.PayloadObjectApplicationListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PayloadEventApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.addApplicationListener(new PayloadObjectApplicationListener());
        ctx.addApplicationListener(new PayloadIntegerApplicationListener());
        ctx.refresh();

        // 广播事件
//        ctx.publishEvent("hahaha");
//        ctx.publishEvent(123456789);
//        ctx.publishEvent(new Person());
    }
}
