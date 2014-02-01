package com.summercoding.benchmark.ioc.guice;

import com.google.inject.Inject;

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
