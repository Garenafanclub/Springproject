package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();

        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloService", new HelloService());  // addServlet is a static method...
        context.addServletMappingDecoded("/hello","HelloService");

        tomcat.start();
        tomcat.getServer().await();

    }
}
