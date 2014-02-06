package com.summercoding.benchmark.ioc.framework.silk;

import com.summercoding.benchmark.ioc.pojo.Base;
import com.summercoding.benchmark.ioc.pojo.Sample;
import com.summercoding.benchmark.ioc.pojo.SampleImpl;
import se.jbee.inject.bind.BinderModule;
import se.jbee.inject.util.Scoped;

/**
 * @author: Rafal Leszko
 */
public class SilkModule extends BinderModule {
    @Override
    protected void declare() {
        ScopedBinder binder = per(Scoped.INJECTION);
        binder.bind(Sample.class).to(SampleImpl.class);
        binder.construct(Base.class);
    }
}
