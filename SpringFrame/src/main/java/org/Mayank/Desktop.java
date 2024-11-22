package org.Mayank;

public class Desktop implements Computer{
    public Desktop()
    {
        System.out.println("Desktop constructor...");
    }
    @Override
    public void code() {
        System.out.println("Code running on Desktop...");
    }
}
