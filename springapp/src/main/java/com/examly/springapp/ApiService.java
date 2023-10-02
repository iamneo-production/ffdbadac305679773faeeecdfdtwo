package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {
    private final List<Laptop> laptops = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        // Implement logic to add laptop to the list
        return laptops.add(laptop);
    }

    public Laptop getLaptopById(int laptopId) {
        // Implement logic to retrieve laptop by ID
        // Return null if not found
        return laptops.stream()
                .filter(laptop -> laptop.getLaptopId() == laptopId)
                .findFirst()
                .orElse(null);
    }

    public List<Laptop> getAllLaptops() {
        return laptops;
    }
}
