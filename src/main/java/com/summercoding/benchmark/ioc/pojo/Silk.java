package com.summercoding.benchmark.ioc.pojo;

import com.summercoding.benchmark.ioc.Framework;
import se.jbee.inject.Dependency;
import se.jbee.inject.Injector;
import se.jbee.inject.bootstrap.Bootstrap;

/**
 * @author: Rafal Leszko
 */
public class Silk implements Framework {

    private final Injector injector;

    public Silk() {
        injector = Bootstrap.injector(SilkRootBundle.class);
    }

    @Override
    public void testGetBean() {
        Dependency<Base> dependency = Dependency.dependency(Base.class);
        Base base = injector.resolve(dependency);
        base.getSample().foo();
    }
}
