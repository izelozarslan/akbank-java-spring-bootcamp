package com.company.repository;

import com.company.entity.House;
import com.company.entity.SummerHouse;

import java.util.ArrayList;

public class SummerHouseRepository {

    ArrayList<SummerHouse> summerHouses;

    public SummerHouseRepository() {
        summerHouses = new ArrayList<SummerHouse>();
        summerHouses.add(new SummerHouse(1, 150000, 25, 1, 1));
        summerHouses.add(new SummerHouse(2, 200000, 80, 3, 1));
        summerHouses.add(new SummerHouse(3, 250000, 65, 2, 1));
        summerHouses.add(new SummerHouse(4, 300000, 75, 3, 1));
        summerHouses.add(new SummerHouse(5, 350000, 80, 3, 2));
    }

    public ArrayList<SummerHouse> getSummerHouseList(){
        return summerHouses;
    }
}
