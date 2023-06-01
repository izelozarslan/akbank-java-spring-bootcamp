package com.company;

import com.company.repository.HouseRepository;
import com.company.repository.SummerHouseRepository;
import com.company.repository.VillaRepository;
import com.company.service.BaseService;
import com.company.service.HouseService;
import com.company.service.SummerHouseService;
import com.company.service.VillaService;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        BaseService baseService = new BaseService(new HouseRepository(), new VillaRepository(), new SummerHouseRepository());
        HouseService houseService = new HouseService(new HouseRepository());
        SummerHouseService summerHouseService = new SummerHouseService(new SummerHouseRepository());
        VillaService villaService = new VillaService(new VillaRepository());

        //HOUSES
        // total amount of houses
        int totalHousePrice = houseService.totalAmount();
        System.out.println("Total house price: " + totalHousePrice);

        //average square feet of houses
        int averageSquareFeetOfHouses = houseService.averageSquareFeet();
        System.out.println("Average Square Feet of Houses : " + averageSquareFeetOfHouses);


        //SUMMER HOUSES
        // total amount of summer houses
        int totalSummerHousePrice = summerHouseService.totalAmount();
        System.out.println("Total summer house price: " + totalSummerHousePrice);

        //average square feet of summer houses
        int averageSquareFeetOfSummerHouse = summerHouseService.averageSquareFeet();
        System.out.println("Average square feet of summer houses : " + averageSquareFeetOfSummerHouse);


        //VILLAS
        // total amount of villas
        int totalAmountOfVillas = villaService.totalAmount();
        System.out.println("Total villa price: " + totalAmountOfVillas);

        //average square feet of villas
        int averageSquareFeetOfVillas = villaService.averageSquareFeet();
        System.out.println("Average square feet of villas : " + averageSquareFeetOfVillas);


        //FOR ALL TYPES
        //total amount of all house types
        int totalAmount = baseService.totalAmountOfAllHouses();
        System.out.println("Total amount of all house types: " + totalAmount);

        //average square feet of all house types
        int averageSquareFeet = baseService.averageSquareFeetOfAllHouses();
        System.out.println("Average square feet of all house types: " + averageSquareFeet);

        //filtered house types by room number & hall number
        List<Object> filteredHouseTypes = baseService.filterHouseTypesByRoomAndLivingRoom(2, 1);
        for (Object houseType : filteredHouseTypes) {
            System.out.println(houseType.getClass().getName().substring(19) + " " +  houseType.toString());
        }

    }

}
