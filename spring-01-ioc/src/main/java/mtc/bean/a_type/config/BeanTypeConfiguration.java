package mtc.bean.a_type.config;


import mtc.bean.a_type.bean.Ball;
import mtc.bean.a_type.bean.Child;
import mtc.bean.a_type.bean.Toy;
import mtc.bean.a_type.bean.ToyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTypeConfiguration {
    
    @Bean
    public Child child() {
        return new Child();
    }


    
    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child());
        return toyFactory;
    }

//    @Bean
//    public Toy ball() {
//        return new Ball("ball");
//    }
}
