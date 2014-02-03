package com.summercoding.benchmark.ioc.dagger;

import com.summercoding.benchmark.ioc.pojo.Sample;
import com.summercoding.benchmark.ioc.pojo.SampleImpl;
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
