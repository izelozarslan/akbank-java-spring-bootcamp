package com.company.service;

import com.company.entity.House;
import com.company.entity.SummerHouse;
import com.company.entity.Villa;
import com.company.repository.HouseRepository;
import com.company.repository.SummerHouseRepository;
import com.company.repository.VillaRepository;

import java.util.ArrayList;
import java.util.List;

public class BaseService {


    private final HouseRepository houseRepository;
    private final VillaRepository villaRepository;
    private final SummerHouseRepository summerHouseRepository;


    public BaseService(HouseRepository houseRepository, VillaRepository villaRepository, SummerHouseRepository summerHouseRepository) {
        this.houseRepository = houseRepository;
        this.villaRepository = villaRepository;
        this.summerHouseRepository = summerHouseRepository;
    }

    public int totalAmountOfAllHouses() {
        int totalAmount = 0;

        List<House> houseList = houseRepository.getHouseList();
        for (House house : houseList) {
            totalAmount += house.getPrice();
        }

        List<Villa> villaList = villaRepository.getVillaList();
        for (Villa villa : villaList) {
            totalAmount += villa.getPrice();
        }

        List<SummerHouse> summerHouseList = summerHouseRepository.getSummerHouseList();
        for (SummerHouse summerHouse : summerHouseList) {
            totalAmount += summerHouse.getPrice();
        }

        return totalAmount;
    }

    public int averageSquareFeetOfAllHouses() {
        int total = 0;
        int average = 0;

        List<House> houseList = houseRepository.getHouseList();
        for (House house : houseList) {
            total += house.getSquareMeter();
        }

        List<Villa> villaList = villaRepository.getVillaList();
        for (Villa villa : villaList) {
            total += villa.getSquareMeter();
        }

        List<SummerHouse> summerHouseList = summerHouseRepository.getSummerHouseList();
        for (SummerHouse summerHouse : summerHouseList) {
            total += summerHouse.getSquareMeter();
        }

        int totalSize = houseList.size() + villaList.size() + summerHouseList.size();
        average = total / totalSize;
        return average;

    }

    /***private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses; */
    public List<Object> filterHouseTypesByRoomAndLivingRoom(int numberOfRoom, int numberOfHall) {
        List<Object> filteredHouseTypes = new ArrayList<>();

        for (House house : houseRepository.getHouseList()) {
            if (house.getNumberOfRoom() == numberOfRoom && house.getNumberOfHall() == numberOfHall) {
                filteredHouseTypes.add(house);
            }
        }

        for (Villa villa : villaRepository.getVillaList()) {
            if (villa.getNumberOfRoom() == numberOfRoom && villa.getNumberOfHall() == numberOfHall) {
                filteredHouseTypes.add(villa);
            }
        }

        for (SummerHouse summerHouse : summerHouseRepository.getSummerHouseList()) {
            if (summerHouse.getNumberOfRoom() == numberOfRoom && summerHouse.getNumberOfHall() == numberOfHall) {
                filteredHouseTypes.add(summerHouse);
            }

        }
        return filteredHouseTypes;
    }


}
