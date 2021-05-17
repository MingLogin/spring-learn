package mtc.annotation.e_basepackageclass.config;

import mtc.annotation.e_basepackageclass.bean.DemoService;
import mtc.annotation.e_basepackageclass.component.DemoComponent;
import mtc.annotation.e_basepackageclass.component.inner.InnerComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {DemoService.class, DemoComponent.class})
public class BasePackageClassConfiguration {
}
