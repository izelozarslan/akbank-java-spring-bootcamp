package com.company.service;

import com.company.entity.SummerHouse;
import com.company.repository.SummerHouseRepository;

import java.util.List;

public class SummerHouseService implements Service {

    private final SummerHouseRepository summerHouseRepository;

    public SummerHouseService(SummerHouseRepository summerHouseRepository) {
        this.summerHouseRepository = summerHouseRepository;
    }

    @Override
    public int totalAmount() {
        int total = 0;
        for (SummerHouse summerHouse : summerHouseRepository.getSummerHouseList()) {
            total += summerHouse.getPrice();
        }
        return total;
    }

    @Override
    public int averageSquareFeet() {
        List<SummerHouse> summerHouseList = summerHouseRepository.getSummerHouseList();

        if (summerHouseList.isEmpty()) {
            return 0;
        }

        int totalSquareMeter = 0;
        int averageSquareMeter = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            totalSquareMeter += summerHouse.getSquareMeter();
        }
        averageSquareMeter = totalSquareMeter / summerHouseList.size();

        return averageSquareMeter;
    }
}
