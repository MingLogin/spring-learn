package mtc.programmatic.c_components;

import mtc.programmatic.a_quickstart.bean.Person;
import mtc.programmatic.b_di.bean.Animal;
import mtc.programmatic.b_di.bean.Cat;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.io.ClassPathResource;

import java.beans.Introspector;
import java.util.Set;

public class ProgrammaticComponentsApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(ctx);
        reader.loadBeanDefinitions(new ClassPathResource("programmatic/programmatic-components.xml"));

//        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
//                .addPropertyValue("name", "老王").getBeanDefinition();
//        ctx.registerBeanDefinition("laowang", personDefinition);

        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(ctx);
        scanner.addIncludeFilter(((metadataReader, metadataReaderFactory) -> {
            // getClassMetadata可以获取到扫描类的相关元信息，此处把Animal的子类都拿出来
            return metadataReader.getClassMetadata().getSuperClassName().equals(Animal.class.getName());
        }));

        // int count = scanner.scan("mtc.programmatic.b_di.bean");
        Set<BeanDefinition> animalDefinitions = scanner.findCandidateComponents("mtc.programmatic.b_di.bean");
        animalDefinitions.forEach(definition -> {
            MutablePropertyValues propertyValues = definition.getPropertyValues();
            String beanClassName = definition.getBeanClassName();
            propertyValues.addPropertyValue("name", beanClassName);
            propertyValues.addPropertyValue("person", new RuntimeBeanReference("laowang"));
            //System.out.println(Introspector.decapitalize(beanClassName.substring(beanClassName.lastIndexOf("."))));
            ctx.registerBeanDefinition(Introspector.decapitalize(beanClassName.substring(beanClassName.lastIndexOf("."))), definition);
        });

        ctx.refresh();

        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
    }
}
