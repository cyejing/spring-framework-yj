package org.cyejing.test;

import org.cyejing.bean.DemoBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by born on 2017/7/8.
 */
public class DemoTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("org/cyejing/test/demo-application.xml");
        DemoBean demo = applicationContext.getBean("demo", DemoBean.class);
        Assert.assertEquals(demo.getName(),"jenny");
        Assert.assertEquals(demo.getType(),"demo");

    }
}
