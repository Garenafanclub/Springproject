package com.example.demo.app.Repository;

import com.example.demo.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(Laptop laptop)
    {
        System.out.println("Saved in Database...");
    }
}
