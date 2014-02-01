package com.summercoding.benchmark.ioc.pojo;

import com.summercoding.benchmark.ioc.Framework;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Rafal Leszko
 */
public class Spring implements Framework {

    private static final String CONTEXT_FILE = "spring.xml";

    private final BeanFactory factory;

    public Spring() {
        factory = new ClassPathXmlApplicationContext(CONTEXT_FILE);
    }

    @Override
    public void testGetBean() {
        Base base = (Base) factory.getBean("base");
        base.getSample().foo();
    }
}