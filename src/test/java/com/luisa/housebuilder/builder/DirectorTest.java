package com.luisa.housebuilder.builder;

import com.luisa.housebuilder.House;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DirectorTest {

    private final Director director = new Director();

    @Test
    void buildsBasicHouseWithNoAttributes() {
        House house = director.buildBasicHouse(new HouseBuilderImpl());

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasPool());
        assertFalse(house.hasStatues());
    }

    @Test
    void buildsHouseWithOnlyGarage() {
        House house = director.buildHouseWithGarage(new HouseBuilderImpl());

        assertTrue(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasPool());
        assertFalse(house.hasStatues());

    }

    @Test
    void buildsHouseWithOnlyGarden() {
        House house = director.buildHouseWithGarden(new HouseBuilderImpl());
        assertFalse(house.hasGarage());
        assertTrue(house.hasGarden());
        assertFalse(house.hasPool());
        assertFalse(house.hasStatues());
    }
    
    @Test
    void builsHouseWithOnlyPool() {
        House house = director.buildHouseWithPool(new HouseBuilderImpl());

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertTrue(house.hasPool());
        assertFalse(house.hasStatues());
    }

    @Test
    void buildsHouseWithOnlyStatues() {
        House house = director.buildHouseWithStatues(new HouseBuilderImpl());
        
        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasPool());
        assertTrue(house.hasStatues());
    }

    @Test
    void buildsLuxuryHouseWithAllAttributes() {
        House house = director.buildLuxuryHouse(new HouseBuilderImpl());

        assertTrue(house.hasGarage());
        assertTrue(house.hasGarden());
        assertTrue(house.hasPool());
        assertTrue(house.hasStatues());
    }
}
