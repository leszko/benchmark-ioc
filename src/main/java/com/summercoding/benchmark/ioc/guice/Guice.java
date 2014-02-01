package com.summercoding.benchmark.ioc.guice;

import com.google.inject.Injector;
import com.summercoding.benchmark.ioc.Framework;

/**
 * @author: Rafal Leszko
 */
public class Guice implements Framework {

    private final Injector injector;

    public Guice() {
        injector = com.google.inject.Guice.createInjector(new GuiceModule());
    }

    @Override
    public void testGetBean() {
        Base base = injector.getInstance(Base.class);
        base.getSample().foo();
    }
}
