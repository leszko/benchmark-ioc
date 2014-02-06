package com.summercoding.benchmark.ioc.framework.dagger;

import com.summercoding.benchmark.ioc.framework.Framework;
import dagger.ObjectGraph;

/**
 * @author: Rafal Leszko
 */
public class Dagger implements Framework {

    private final ObjectGraph objectGraph;

    public Dagger() {
        objectGraph = ObjectGraph.create(new DaggerModule());
    }

    @Override
    public void testGetBean() {
        Base base = objectGraph.get(Base.class);
        base.getSample().foo();
    }
}
