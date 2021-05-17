package mtc.annotation.f_typefilter.config;

import mtc.annotation.f_typefilter.anno.Animal;
import mtc.annotation.f_typefilter.color.Color;
import mtc.annotation.f_typefilter.filter.GreenTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "mtc.annotation.f_typefilter",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "mtc.annotation.f_typefilter.+Demo.+")
        },
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Color.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = GreenTypeFilter.class)
        })
public class TypeFilterConfiguration {
}
