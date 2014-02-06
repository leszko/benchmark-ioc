package com.summercoding.benchmark.ioc.framework.guice;

import com.google.inject.Inject;
import com.summercoding.benchmark.ioc.pojo.Sample;

/**
 * @author: Rafal Leszko
 */
public class Base {
    @Inject
    private Sample sample;

    public Sample getSample() {
        return sample;
    }
}
