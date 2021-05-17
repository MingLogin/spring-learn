package mtc.lifecycle.d_prototype.config;

import mtc.lifecycle.d_prototype.bean.Pen;
import mtc.lifecycle.d_prototype.bean.Pen1;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeLifecycleConfiguration1 {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Pen1 pen() {
        return new Pen1();
    }
}
