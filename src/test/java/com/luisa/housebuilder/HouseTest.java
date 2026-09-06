package com.luisa.housebuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HouseTest {
    @Test
    void constructorAssingsAllAttributesCorrectly() {
        House house = new House(true, false, true, false);

        assertTrue(house.hasGarage());
        assertFalse(house.hasGarden());
        assertTrue(house.hasPool());
        assertFalse(house.hasStatues());
}
    
}
