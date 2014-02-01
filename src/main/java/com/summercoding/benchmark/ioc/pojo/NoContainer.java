package com.summercoding.benchmark.ioc.pojo;

import com.summercoding.benchmark.ioc.Framework;

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
