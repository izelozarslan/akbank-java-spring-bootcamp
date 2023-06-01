package com.company.repository;

import com.company.entity.BaseHouseType;
import com.company.entity.House;

import java.util.ArrayList;

public class HouseRepository {

    ArrayList<House> houses;

    public HouseRepository() {
        houses = new ArrayList<House>();
        houses.add(new House(1, 100000, 50, 1, 1));
        houses.add(new House(2, 200000, 60, 2, 1));
        houses.add(new House(3, 300000, 70, 3, 1));
        houses.add(new House(4, 400000, 80, 3, 1));
        houses.add(new House(5, 500000, 90, 3, 2));
    }


    public ArrayList<House> getHouseList(){
        return  houses;
    }

}
