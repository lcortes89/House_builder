package com.luisa.housebuilder.builder;

import com.luisa.housebuilder.House;

public class Director {

    public House buildBasicHouse(HouseBuilder builder) {
        return builder
                .setGarage(false)
                .setGarden(false)
                .setPool(false)
                .setStatues(false)
                .build();
    }

    public House buildHouseWithGarage(HouseBuilder builder) {
        return builder
                .setGarage(true)
                .setGarden(false)
                .setPool(false)
                .setStatues(false)
                .build();
    }

    public House buildHouseWithGarden(HouseBuilder builder) {
        return builder
                .setGarage(false)
                .setGarden(true)
                .setPool(false)
                .setStatues(false)
                .build();
    }
    
    public House buildHouseWithPool(HouseBuilder builder) {
        return builder
                .setGarage(false)
                .setGarden(false)
                .setPool(true)
                .setStatues(false)
                .build();
    }

    public House buildHouseWithStatues(HouseBuilder builder) {
        return builder
                .setGarage(false)
                .setGarden(false)
                .setPool(false)
                .setStatues(true)
                .build();
    }

    public House buildLuxuryHouse(HouseBuilder builder) {
        return builder
                .setGarage(true)
                .setGarden(true)
                .setPool(true)
                .setStatues(true)
                .build();
    }
}
