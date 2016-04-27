package spring_factorybean_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by louis.yu on 2016/4/27.
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath*:/demo1.xml");
        System.out.println(applicationContext.getId());
        System.out.println(applicationContext.getDisplayName());
        System.out.println(applicationContext.getBean("car7"));
    }
}
