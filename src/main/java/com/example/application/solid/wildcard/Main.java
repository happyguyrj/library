package com.example.application.solid.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuilding(buildings);

        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
//        compile time error
//        printBuilding(offices);
        printBuildingUsingWildcard(offices);

        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
//        compile time error
//        printBuilding(houses);
        printBuildingUsingWildcard(houses);

        addHouseToList(houses);
//        compile time error, supertype cannot be passed
//        addHouseToList(buildings);
        addHouseToListUsingWildCard(buildings);
    }

    static void printBuilding(List<Building> buildings) {
        for (Building building : buildings) {
            System.out.println(building.toString());
        }
        System.out.println();
    }

    static void printBuildingUsingWildcard(List<? extends Building> buildings) {
        for (Building building : buildings) {
            System.out.println(building.toString());
        }
        System.out.println();
    }

    static void addHouseToList(List<House> buildings) {
        buildings.add(new House());
    }

    static void addHouseToListUsingWildCard(List<? super House> buildings) {
        buildings.add(new House());
    }
}
