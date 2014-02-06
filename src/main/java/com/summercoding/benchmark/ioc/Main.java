package com.summercoding.benchmark.ioc;

import com.summercoding.benchmark.ioc.framework.Framework;
import com.summercoding.benchmark.ioc.framework.NoContainer;
import com.summercoding.benchmark.ioc.framework.PicoContainer;
import com.summercoding.benchmark.ioc.framework.Spring;
import com.summercoding.benchmark.ioc.framework.dagger.Dagger;
import com.summercoding.benchmark.ioc.framework.guice.Guice;
import com.summercoding.benchmark.ioc.framework.silk.Silk;

/**
 * @author: Rafal Leszko
 */
public class Main {
    private static final Framework[] FRAMEWORKS = {new NoContainer(), new Spring(), new PicoContainer(), new Guice(), new Silk(), new Dagger()};

    private static final int TIMES = 10_000_000;

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
