package mtc.basic_di.h_aware.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.NamedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

public class AwaredTestBean implements ApplicationContextAware, BeanNameAware, NamedBean {

    private String beanName;
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Override
    public void setBeanName(String name) {
        this.beanName =name;
    }



    @Override
    public String getBeanName() {
        return beanName;
    }
}
