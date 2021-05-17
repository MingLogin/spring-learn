package mtc.configuration.c_conditiona.anno;

import mtc.configuration.c_conditiona.component.Boss;
import mtc.configuration.c_conditiona.config.BartenderConfiguration;
import mtc.configuration.c_conditiona.registrar.WaiterRegistrar;
import mtc.configuration.c_conditiona.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
