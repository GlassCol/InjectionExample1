package org.injection.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student);
    }

}
