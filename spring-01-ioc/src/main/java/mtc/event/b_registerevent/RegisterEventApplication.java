package mtc.event.b_registerevent;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterEventApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "mtc.event.b_registerevent");
        RegisterService registerService = ctx.getBean(RegisterService.class);
        registerService.register("张大三");
    }
}
