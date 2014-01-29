package com.summercoding.benchmark.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Rafal Leszko
 */
public class Spring implements Framework {

    private static final String CONTEXT_FILE = "spring.xml";

    private final BeanFactory factory;
    private int times = 1;

    public Spring() {
        factory = new ClassPathXmlApplicationContext(CONTEXT_FILE);
    }

    @Override
    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public void testGetBean() {
        for (int i = 0; i < times; i++) {
            Base base = (Base) factory.getBean("base");
            base.getSample().foo();
        }
    }
}
