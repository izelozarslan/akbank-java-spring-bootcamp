package com.company.service;

import com.company.entity.House;
import com.company.repository.HouseRepository;

import java.util.List;

public class HouseService implements Service{
    private final HouseRepository houseRepository;


    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public int totalAmount() {
        int total = 0;
        for (House house : houseRepository.getHouseList()) {
            total += house.getPrice();
        }
        return total;
    }


    @Override
    public int averageSquareFeet() {
        List<House> houseList = houseRepository.getHouseList();

        if (houseList.isEmpty()) {
            return 0;
        }

        int totalSquareMeter = 0;
        int averageSquareMeter = 0;
        for (House house : houseList) {
            totalSquareMeter += house.getSquareMeter();
        }
        averageSquareMeter = totalSquareMeter / houseList.size();

        return averageSquareMeter;
    }
}
