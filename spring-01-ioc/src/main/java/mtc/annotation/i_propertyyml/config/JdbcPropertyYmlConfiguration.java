package mtc.annotation.i_propertyyml.config;

import mtc.annotation.i_propertyyml.factory.YmlPropertySourceFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("mtc.annotation.i_propertyyml.bean")
@PropertySource(value = "classpath:propertysource/jdbc.yml",factory = YmlPropertySourceFactory.class)
public class JdbcPropertyYmlConfiguration {
}
