package org.Mayank;

public class Laptop implements Computer {
    public Laptop()
    {
        System.out.println("Laptop constructor...");
    }
    public void work()
    {
        System.out.println("Mayank doing coding...");
    }

    @Override
    public void code() {
        System.out.println("Code running on laptop...");
    }
}
