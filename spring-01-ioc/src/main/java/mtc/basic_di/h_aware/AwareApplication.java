package mtc.basic_di.h_aware;

import mtc.basic_di.h_aware.bean.AwaredTestBean;
import mtc.basic_di.h_aware.config.AwareConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredTestBean bbb = ctx.getBean(AwaredTestBean.class);
        bbb.printBeanNames();

        System.out.println("-----------");
        System.out.println(bbb.getBeanName());
    }
}
