package com.ps.beans.others;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class MtBeanTest {

    private Logger logger = LoggerFactory.getLogger(MtBeanTest.class);

    @Test
    public void testConfig() {
        //TODO 6. Modify this class to use the new set of configuration files, created by resolving TODO 5.
        //DONE
        //TODO 7. Try to use wildcards as well.
        //DONE

        /*
            Wl; Load the context in a string delimited way
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/others/sample-config-01.xml",
                "classpath:spring/others/wilson-conversion.xml",
                "classpath:spring/others/wilson-factory.xml");
        */

        // Currently loading by loading other context in the sample-config.xml <import resource="classpath:spring/others/wilson-*"/>
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/others/sample-config-01.xml");


        MultipleTypesBean mtBean = (MultipleTypesBean) ctx.getBean("mtBean");
        assertNotNull(mtBean);

    }
}
