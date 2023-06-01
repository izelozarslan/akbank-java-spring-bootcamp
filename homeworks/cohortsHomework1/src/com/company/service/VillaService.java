package com.company.service;

import com.company.entity.Villa;
import com.company.repository.VillaRepository;

import java.util.List;

public class VillaService implements Service {

    private final VillaRepository villaRepository;

    public VillaService(VillaRepository villaRepository) {
        this.villaRepository = villaRepository;
    }

    @Override
    public int totalAmount() {
        int total = 0;
        for (Villa villa : villaRepository.getVillaList()) {
            total += villa.getPrice();
        }
        return total;
    }

    @Override
    public int averageSquareFeet() {
        List<Villa> villaList = villaRepository.getVillaList();

        if (villaList.isEmpty()) {
            return 0;
        }

        int totalSquareMeter = 0;
        int averageSquareMeter = 0;
        for (Villa villa : villaList) {
            totalSquareMeter += villa.getSquareMeter();
        }
        averageSquareMeter = totalSquareMeter / villaList.size();

        return averageSquareMeter;
    }
}
