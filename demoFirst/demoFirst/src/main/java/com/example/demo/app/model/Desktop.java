package com.example.demo.app.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class Desktop implements Computer {
    public Desktop()
    {
        System.out.println("DESKTOP OBJECT CREATED...");
    }

    @Override
    public void compile() {
        System.out.println("Desktop Compiling...");
    }
}
