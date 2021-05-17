package mtc.lifecycle.e_resource.config;


import mtc.lifecycle.e_resource.bean.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class LifecycleDestructionPostProcessor implements DestructionAwareBeanPostProcessor {
    
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat) {
            Cat cat = (Cat) bean;
            System.out.println(cat.getName() + "被放走了 ......");
        }
    }
}
