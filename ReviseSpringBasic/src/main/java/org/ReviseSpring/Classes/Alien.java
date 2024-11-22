package org.ReviseSpring.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("23")
    private int age;
//  @Autowired    // FIELD INJECTION...NOT GOOD APPROACH...
    private Computer computer;
    public Alien()
    {
        System.out.println("Alien Object created...");
    }

    public Alien(int age, Computer computer) {
        System.out.println("Calling Para Const of Alien...");
        this.age = age;
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Injection of age");
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code()
    {
        computer.compile();
    }
}
