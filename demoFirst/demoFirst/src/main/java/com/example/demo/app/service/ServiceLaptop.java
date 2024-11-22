package com.example.demo.app.service;

import com.example.demo.app.Repository.LaptopRepo;
import com.example.demo.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLaptop {
    @Autowired
    private LaptopRepo laptopRepo;
    public void addLaptop(Laptop laptop)
    {
        laptopRepo.save(laptop);
    }

    public boolean GoodForGaming(Laptop lap)
    {
        System.out.println("Doing some internal working with service(processing)");
        return true;
    }
}
