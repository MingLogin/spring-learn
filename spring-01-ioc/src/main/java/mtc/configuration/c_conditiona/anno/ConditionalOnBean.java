package mtc.configuration.c_conditiona.anno;

import mtc.configuration.c_conditiona.condition.OnBeanCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {

    String[] beanNames() default {};

    Class<?>[] value() default {};
}
