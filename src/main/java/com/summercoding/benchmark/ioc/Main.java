package com.summercoding.benchmark.ioc;

/**
 * @author: Rafal Leszko
 */
public class Main {
    private static final Framework[] FRAMEWORKS = {new Spring(), new PicoContainer()};

    private static final int TIMES = 1000000;

    public static void main(String[] args) {
        System.out.println("IoC Benchmark");

        benchmark();
    }

    private static void benchmark() {
        for (Framework framework : FRAMEWORKS) {
            long start = System.currentTimeMillis();
            benchmark(framework);
            long end = System.currentTimeMillis();
            System.out.println(framework.getClass().getSimpleName() + ":\t" + (end - start));
        }
    }

    private static void benchmark(Framework framework) {
        for (int i = 0; i < TIMES; i++) {
            framework.testGetBean();
        }
    }
}
