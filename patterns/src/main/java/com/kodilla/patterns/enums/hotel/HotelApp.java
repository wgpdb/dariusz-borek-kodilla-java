package com.kodilla.patterns.enums.hotel;

public class HotelApp {

    public static void main(String[] args) {
        System.out.println("Accommodation rates:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getSingleRoomRate());
        System.out.println("   - high season: " + Season.HIGH.getSingleRoomRate());
        System.out.println("   - holiday season: " + Season.HOLIDAY.getSingleRoomRate());
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getDoubleRoomRate());
        System.out.println("   - high season: " + Season.HIGH.getDoubleRoomRate());
        System.out.println("   - holiday season: " + Season.HOLIDAY.getDoubleRoomRate());

        Season season = Season.HOLIDAY;
        System.out.println(season);
    }
}