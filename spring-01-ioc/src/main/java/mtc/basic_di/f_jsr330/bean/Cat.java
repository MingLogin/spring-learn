package mtc.basic_di.f_jsr330.bean;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class Cat {

    private String name = "mimi";

    @Inject
    @Named("admin")
    private Person person;

    @Override
    public String toString() {
        return "Bird{" +
                "person=" + person +
                '}';
    }
}
