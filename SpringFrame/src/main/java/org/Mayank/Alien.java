package org.Mayank;

public class Alien {
    private int age;
    private Computer computer;
    public Alien()
    {
        System.out.println("Object Created");
    }
//    public Alien(int age, Laptop laptop)
//    {
//        System.out.println("Para const injection.");
//        this.age = age;
//        this.laptop = laptop;
//    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        System.out.println("Setter Injection on Laptop");
//        this.laptop = laptop;
//    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        System.out.println("Setter injection of computer interface.");
        this.computer = computer;
    }

    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        System.out.println("Setter injection on Age");
        this.age = age;
    }
    public void code()
    {
        computer.code();
//        System.out.println("Laid Back...");
    }
}
