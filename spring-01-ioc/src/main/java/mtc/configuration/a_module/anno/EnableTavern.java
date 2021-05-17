package mtc.configuration.a_module.anno;

import mtc.configuration.a_module.component.Bartender;
import mtc.configuration.a_module.component.Boss;
import mtc.configuration.a_module.config.BartenderConfiguration;
import mtc.configuration.a_module.registrar.WaiterRegistrar;
import mtc.configuration.a_module.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
