package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloService extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Got the Request to console.");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<H2><B>Hello World</H2></B>");
    }
}
