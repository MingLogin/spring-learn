package mtc.postprocessor.e_instantiation.config;

import mtc.postprocessor.e_instantiation.bean.Ball;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class BallFactoryInstantiationProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("ball".equals(beanName)) {
            // 返回非null，代表拦截创建
            Ball ball = new Ball();
            ball.setId("工厂球~");
            return ball;
        }
        // 默认直接返回null，代表不拦截
        return null;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if ("ball2".equals(beanName)) {
            MutablePropertyValues values = new MutablePropertyValues(pvs);
            values.add("id", "拦截球~");
            return values;
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

}
