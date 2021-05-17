package mtc.a_original.service.impl;

import mtc.a_original.dao.DemoDao;
import mtc.a_original.dao.impl.DemoDaoImpl;
import mtc.a_original.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = new DemoDaoImpl();
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
