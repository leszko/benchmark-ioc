package com.summercoding.benchmark.ioc;

/**
 * @author: Rafal Leszko
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("IoC Benchmark");
        Framework framework = new Spring();
        framework.setTimes(100);
        framework.testGetBean();
    }
}
