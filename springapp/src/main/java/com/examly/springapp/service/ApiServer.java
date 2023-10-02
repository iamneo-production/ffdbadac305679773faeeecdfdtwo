package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {
    private final List<Laptop> laptops = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        return laptops.add(laptop);
    }

    public Laptop getLaptop(int laptopid) {
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopid() == laptopid) {
                return laptop;
            }
        }
        return null; // Return null if laptop with given ID is not found
    }

    public List<Laptop> getAllLaptops() {
        return laptops;
    }
}
