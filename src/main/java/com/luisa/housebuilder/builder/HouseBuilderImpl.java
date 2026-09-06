package com.luisa.housebuilder.builder;

import com.luisa.housebuilder.House;


public class HouseBuilderImpl implements HouseBuilder{

    private boolean garage;
    private boolean garden;
    private boolean pool;
    private boolean statues;

    @Override
    public HouseBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    @Override
    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }

    @Override
    public HouseBuilder setPool(boolean pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public HouseBuilder setStatues(boolean statues) {
        this.statues = statues;
        return this;
    }

    @Override
    public House build() {
        return new House(garage, garden, pool, statues);
    }
    
}
