package mtc.lifecycle.d_prototype.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Pen1 implements DisposableBean {

    private Integer ink;



    @PreDestroy
    public void outwellInk() {
        System.out.println("@PreDestroy...");
        this.ink = 0;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean...");
    }

    @Override
    public String toString() {
        return "Pen{" +
                "ink=" + ink +
                '}';
    }
}
