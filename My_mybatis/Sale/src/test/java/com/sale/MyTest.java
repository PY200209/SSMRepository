package com.sale;

import com.sale.service.service1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        service1 service1 = (com.sale.service.service1) applicationContext.getBean("service1");
        int x = service1.sale(1001,5);
        System.out.println(x);
    }
}
