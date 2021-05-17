package mtc.annotation.i_propertyyml;


import mtc.annotation.i_propertyyml.bean.JdbcYmlProperty;
import mtc.annotation.i_propertyyml.config.JdbcPropertyYmlConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceYmlApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                JdbcPropertyYmlConfiguration.class);
        System.out.println(ctx.getBean(JdbcYmlProperty.class).toString());
    }
}
