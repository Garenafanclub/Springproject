package org.Mayank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien alien1 = (Alien) context.getBean("alien1");
        alien1.code();

        System.out.println(alien1.getAge());   // Setter injection...not directly assign to age property it will go to setter.


//        Alien alien2 = (Alien) context.getBean("alien1");
//        alien2.code();
//        System.out.println(alien2.age);
    }
}
// THAT MEANS BY DEFAULT IT ONLY HAV
// E ONE OBJECT DURING CREATION OF APPLICATION CONTEXT...