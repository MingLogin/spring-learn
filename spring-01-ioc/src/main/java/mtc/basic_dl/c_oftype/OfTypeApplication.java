package mtc.basic_dl.c_oftype;

import javafx.application.Application;
import mtc.basic_dl.c_oftype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class OfTypeApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-oftype.xml");
        Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + ":" + bean.toString());
        });
    }
}
