package org.ReviseSpring.Classes;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop()
    {
        System.out.println("Desktop Object Created...");
    }
    public void compile()
    {
        System.out.println("Desktop compiling...");
    }
}
