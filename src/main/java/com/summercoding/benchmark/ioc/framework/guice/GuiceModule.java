package com.summercoding.benchmark.ioc.framework.guice;

import com.google.inject.AbstractModule;
import com.summercoding.benchmark.ioc.pojo.Sample;
import com.summercoding.benchmark.ioc.pojo.SampleImpl;

/**
 * @author: Rafal Leszko
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Sample.class).to(SampleImpl.class);
    }
}
