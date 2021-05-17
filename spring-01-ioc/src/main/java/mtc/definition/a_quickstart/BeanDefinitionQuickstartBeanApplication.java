package mtc.definition.a_quickstart;


import mtc.definition.a_quickstart.config.BeanDefinitionQuickstartConfiguration;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionQuickstartBeanApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                BeanDefinitionQuickstartConfiguration.class);
        BeanDefinition personBeanDefinition = ctx.getBeanDefinition("person");
        System.out.println(personBeanDefinition);
        System.out.println(personBeanDefinition.getClass().getName());
    }
}
