package mtc.postprocessor.h_factoryprocessor.config;


import mtc.postprocessor.h_factoryprocessor.bean.Color;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ColorNameSetterPostProcessor implements BeanPostProcessor {
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Color) {
            System.out.println("Color object name setting ...... " + beanName);
            Color color = (Color) bean;
            color.setName(beanName);
        }
        return bean;
    }
}
