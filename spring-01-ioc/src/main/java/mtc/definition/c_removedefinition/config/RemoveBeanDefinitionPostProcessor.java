package mtc.definition.c_removedefinition.config;

import mtc.definition.c_removedefinition.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

@Component
public class RemoveBeanDefinitionPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
        //获取IOC容器中的所有BeanDefinition
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            // 判断BeanDefinition对应的Bean是否为Person类型
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
            if (Person.class.getName().equals(beanDefinition.getBeanClassName())) {
                // 判断Person的性别是否为male
                // 使用xml配置文件对bean进行属性注入，最终取到的类型为TypedStringValue，这一点不需要记住
                TypedStringValue sex = (TypedStringValue) beanDefinition.getPropertyValues().get("sex");
                if ("male".equals(sex.getValue())) {
                    // 移除BeanDefinition
                    registry.removeBeanDefinition(beanDefinitionName);
                }
            }
        }

    }
}
