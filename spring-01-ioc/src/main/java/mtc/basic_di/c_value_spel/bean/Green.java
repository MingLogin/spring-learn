package mtc.basic_di.c_value_spel.bean;

import org.springframework.stereotype.Component;

//@Component
public class Green {
    //@Value("#{'copy of ' + blue.name}")
    private String name;

   // @Value("#{blue.order + 1}")
    private Integer order;

    @Override
    public String toString() {
        return "Green{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
