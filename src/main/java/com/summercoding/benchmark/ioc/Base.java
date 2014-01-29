package com.summercoding.benchmark.ioc;

/**
 * @author: Rafal Leszko
 */
public class Base {
    private Sample sample;

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public Sample getSample() {
        return sample;
    }
}
