package com.summercoding.benchmark.ioc.pojo;

/**
 * @author: Rafal Leszko
 */
public class Base {
    private Sample sample;

    public Base(Sample sample) {
        this.sample = sample;
    }

    public Sample getSample() {
        return sample;
    }
}
