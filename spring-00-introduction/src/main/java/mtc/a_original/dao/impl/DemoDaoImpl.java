package mtc.a_original.dao.impl;

import mtc.a_original.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa","bbb","ccc");
    }
}
