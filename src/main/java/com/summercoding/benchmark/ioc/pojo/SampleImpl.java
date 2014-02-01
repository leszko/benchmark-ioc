package com.summercoding.benchmark.ioc.pojo;

/**
 * @author: Rafal Leszko
 */
public class SampleImpl implements Sample {
    private static int count = 0;

    public SampleImpl() {
        // count++;
    }

    @Override
    public void foo() {
        // System.out.println(count);
        // System.out.println("SampleImpl foo method invoked.");
    }
}
