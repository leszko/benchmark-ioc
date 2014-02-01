package com.summercoding.benchmark.ioc.guice;

import com.google.inject.AbstractModule;

/**
 * @author: Rafal Leszko
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Sample.class).to(SampleImpl.class);
    }
}
