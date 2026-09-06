package com.luisa.housebuilder.builder;

import com.luisa.housebuilder.House;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HouseBuilderImplTest {
    @Test
    void buildsHouseWithAllAtributesTrue(){
        House house = new HouseBuilderImpl()
                .setGarage(true)
                .setGarden(true)
                .setPool(true)
                .setStatues(true)
                .build();

        assertTrue(house.hasGarage());
        assertTrue(house.hasGarden());
        assertTrue(house.hasPool());
        assertTrue(house.hasStatues());
    }

    @Test
    void buildsHouseWithAllAttributesFalseByDefault() {
        House house = new HouseBuilderImpl().build();

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasPool());
        assertFalse(house.hasStatues());
    }

    @Test
    void methodsCanBeChainedAndReturnSameBuilder() {
        HouseBuilderImpl builder = new HouseBuilderImpl();

        HouseBuilder returned = builder.setGarage(true);

        assertTrue(returned == builder);
    }
    
}
