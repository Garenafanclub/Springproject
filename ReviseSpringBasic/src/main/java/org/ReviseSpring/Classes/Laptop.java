package org.ReviseSpring.Classes;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
//@Primary
public class Laptop implements Computer {
    public Laptop()
    {
        System.out.println("Laptop Object Created...");
    }
    @Override
    public void compile()
    {
        System.out.println("Compiling using laptop...");
    }
}
