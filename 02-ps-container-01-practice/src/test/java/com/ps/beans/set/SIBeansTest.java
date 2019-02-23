package com.ps.beans.set;

import com.ps.beans.ComplexBean;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class SIBeansTest {
    private Logger logger = LoggerFactory.getLogger(SIBeansTest.class);

    @Test
    public void testConfig() {
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/set/sample-config-01.xml");
         ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/set/sample-config-02.xml");

        logger.info(" --- All beans in context --- ");
        for(String beanName :  ctx.getBeanDefinitionNames()) {
            logger.info("Bean " + beanName + " of type " + ctx.getBean(beanName).getClass().getSimpleName());
        }

        //TODO 4. Retrieve beans of types ComplexBean and make sure their dependencies were correctly set.
        //DONE
        ComplexBeanImpl bean0 = (ComplexBeanImpl) ctx.getBean("complexBean0");
        ComplexBeanImpl bean1 = (ComplexBeanImpl) ctx.getBean ("complexBean1");
        ComplexBean2Impl bean2 = (ComplexBean2Impl) ctx.getBean("complexBean2");

        assertNotNull(bean0.getSimpleBean());
        assertNotNull(bean1.getSimpleBean());
        assertNotNull(bean2.getSimpleBean());

        assertSame(bean0.getSimpleBean(), bean1.getSimpleBean());

    }
}
