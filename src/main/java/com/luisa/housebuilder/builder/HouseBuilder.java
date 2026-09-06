package com.luisa.housebuilder.builder;

import com.luisa.housebuilder.House;

public interface HouseBuilder {

    HouseBuilder setGarage(boolean garage);
    HouseBuilder setGarden(boolean garden);
    HouseBuilder setPool(boolean pool);
    HouseBuilder setStatues(boolean statues);

    House build();
    
}
