package mtc.configuration.c_conditiona.config;

import mtc.configuration.c_conditiona.anno.ConditionalOnBean;
import mtc.configuration.c_conditiona.component.Bar;
import mtc.configuration.c_conditiona.condition.ExistBossCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    //@Conditional(ExistBossCondition.class)
    @ConditionalOnBean(beanNames = "mtc.configuration.c_conditional.component.Boss")
    public Bar bbbar() {
        return new Bar();
    }
}
