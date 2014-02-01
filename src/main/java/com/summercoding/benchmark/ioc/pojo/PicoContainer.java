package com.summercoding.benchmark.ioc.pojo;

import com.summercoding.benchmark.ioc.Framework;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

/**
 * @author: Rafal Leszko
 */
public class PicoContainer implements Framework {

    private final MutablePicoContainer picoContainer;

    public PicoContainer() {
        picoContainer = new DefaultPicoContainer();
        picoContainer.addComponent(Base.class);
        picoContainer.addComponent(SampleImpl.class);
    }

    @Override
    public void testGetBean() {
        Base base = picoContainer.getComponent(Base.class);
        base.getSample().foo();
    }
}
