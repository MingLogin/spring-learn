package mtc.event.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuickstartListenerApplication {

    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "mtc.event.a_quickstart");
        System.out.println("IOC容器初始化完成。。。");
        ctx.close();
        System.out.println("IOC容器关闭。。。");
    }
}
