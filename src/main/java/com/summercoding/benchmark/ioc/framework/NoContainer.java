package com.summercoding.benchmark.ioc.framework;

import com.summercoding.benchmark.ioc.pojo.Base;
import com.summercoding.benchmark.ioc.pojo.SampleImpl;

/**
 * @author: Rafal Leszko
 */
public class NoContainer implements Framework {
    @Override
    public void testGetBean() {
        Base base = new Base(new SampleImpl());
        base.getSample().foo();
    }
}
