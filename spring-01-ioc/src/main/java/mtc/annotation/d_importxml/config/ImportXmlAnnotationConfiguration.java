package mtc.annotation.d_importxml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:annotation/xml-config.xml")
public class ImportXmlAnnotationConfiguration {
    
}
