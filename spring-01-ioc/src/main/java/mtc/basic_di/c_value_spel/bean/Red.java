//package mtc.basic_di.c_value_spel.animals;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Red {
//    @Value("$red.name")  //注意  要有占位符和{}
//    private String name;
//
//    @Value("${red.order}")
//    private Integer order;
//
//    public Red(String name, Integer order) {
//        this.name = name;
//        this.order = order;
//    }
//
//    @Override
//    public String toString() {
//        return "Black{" +
//                "name='" + name + '\'' +
//                ", order=" + order +
//                '}';
//    }
//}
