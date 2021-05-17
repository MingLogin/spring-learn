package mtc.configuration.z_spi;

import mtc.configuration.z_spi.bean.DemoDao;

import java.util.ServiceLoader;

public class JdkSpiApplication {

    public static void main(String[] args) {
        ServiceLoader<DemoDao> serviceLoader = ServiceLoader.load(DemoDao.class);
        serviceLoader.iterator().forEachRemaining(dao -> {
            System.out.println(dao);
        });
    }
}
