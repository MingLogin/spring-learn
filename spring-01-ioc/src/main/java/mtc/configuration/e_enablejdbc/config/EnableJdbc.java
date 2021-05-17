package mtc.configuration.e_enablejdbc.config;


import mtc.configuration.e_enablejdbc.components.JdbcConfigSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfigSelector.class)
public @interface EnableJdbc {
    
}
