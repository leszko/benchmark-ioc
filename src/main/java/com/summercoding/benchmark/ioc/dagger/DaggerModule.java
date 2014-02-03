package com.summercoding.benchmark.ioc.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * @author: Rafal Leszko
 */
@Module(injects = Base.class)
public class DaggerModule {
    @Provides
    Sample provideSample() {
        return new SampleImpl();
    }
}
