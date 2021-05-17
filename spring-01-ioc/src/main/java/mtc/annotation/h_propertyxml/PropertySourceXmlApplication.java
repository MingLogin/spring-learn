package mtc.annotation.h_propertyxml;


import mtc.annotation.h_propertyxml.bean.JdbcXmlProperty;
import mtc.annotation.h_propertyxml.config.JdbcPropertyXmlConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceXmlApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                JdbcPropertyXmlConfiguration.class);
        System.out.println(ctx.getBean(JdbcXmlProperty.class).toString());
    }
}
