package com.example.application.solid.lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();

        build(building);
        build(office);

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        build(buildings);

        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        //offices.add(new Building());

        //lsp do to apply to list
        //build(offices);
    }

    // Since office is a subtype of building it can be passed into building
    static void build(Building building) {
        System.out.println("Building a " + building.toString());
    }

    static void build(List<Building> building) {
        System.out.println("Building a " + building.toString());
    }
}
