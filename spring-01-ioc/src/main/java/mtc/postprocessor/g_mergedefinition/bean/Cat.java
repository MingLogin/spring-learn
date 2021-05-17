package mtc.postprocessor.g_mergedefinition.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    @Value("咪咪")
    private String name;

    @Override
    public String toString() {
        return "Cat {person: " + this.getPerson() + ", name: " + name + "}";
    }

    public Cat() {
        System.out.println("Cat constructor run ......");
    }

}
