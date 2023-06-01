package com.company.entity;

public class BaseHouseType {
    private int id;
    private int price;
    private int squareMeter;
    private int numberOfRoom;
    private int numberOfHall;

    public BaseHouseType(int id, int price, int squareMeter, int numberOfRoom, int numberOfHall) {
        this.id = id;
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRoom = numberOfRoom;
        this.numberOfHall = numberOfHall;
    }

    public BaseHouseType() {
    }

    @Override
    public String toString() {
        return ": { ID: " + id + ", Price: " + price + ", Size: " + squareMeter + ", Rooms: " + numberOfRoom + ", Halls: " + numberOfHall + " }";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfHall() {
        return numberOfHall;
    }

    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }
}
