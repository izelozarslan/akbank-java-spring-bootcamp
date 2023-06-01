package com.company.repository;

import com.company.entity.SummerHouse;
import com.company.entity.Villa;

import java.util.ArrayList;

public class VillaRepository {

    ArrayList<Villa> villas;

    public VillaRepository() {
        villas = new ArrayList<Villa>();
        villas.add(new Villa(1, 230000, 45, 1, 1));
        villas.add(new Villa(2, 315000, 65, 2, 1));
        villas.add(new Villa(3, 720000, 70, 2, 2));
        villas.add(new Villa(4, 500000, 55, 2, 1));
        villas.add(new Villa(5, 950000, 75, 3, 2));
    }

    public ArrayList<Villa> getVillaList(){
        return villas;
    }
}
