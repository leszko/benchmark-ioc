package com.summercoding.benchmark.ioc.dagger;

import javax.inject.Inject;

/**
 * @author: Rafal Leszko
 */
public class Base {
    private Sample sample;

    @Inject
    public Base(Sample sample) {
        this.sample = sample;
    }

    public Sample getSample() {
        return sample;
    }
}
