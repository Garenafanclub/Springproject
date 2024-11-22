package com.example.demo.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public Laptop()
    {
        System.out.println("LAPTOP OBJECT CREATED...");
    }
    @Override
    public void compile()
    {
        System.out.println("Laptop Compiling...");
    }
}
