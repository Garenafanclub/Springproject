package org.ReviseSpring;

import org.ReviseSpring.Classes.Alien;
import org.ReviseSpring.coding.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


         Alien obj1 = context.getBean(Alien.class);
         System.out.println(obj1.getAge());
         obj1.code();

//         Laptop laptop = context.getBean(Laptop.class);
//         laptop.compile();
//
//         Laptop laptop1 = context.getBean(Laptop.class);
//         laptop1.compile();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        // create a container for you.... and configuration for spring container in mention in spring.xml
//        Alien obj = (Alien) context.getBean("alien1");
//        obj.code();

       // Alien obj1 = (Alien) context.getBean("alien1");
       // System.out.println(obj1.age);
       // obj1.code();

//        Desktop desktop = context.getBean("des" , Desktop.class);
//        desktop.compile();
//        Computer computer = context.getBean(Computer.class);
//        // Because we mention primary bean in laptop bean in spring.xml that why it show no error.
//        computer.compile();
    }
}
