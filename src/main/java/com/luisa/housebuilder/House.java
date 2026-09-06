package com.luisa.housebuilder;

public class House {
    private final boolean garage;
    private final boolean garden;
    private final boolean pool;
    private final boolean statues;

    public House(boolean garage, boolean garden, boolean pool, boolean statues) {
        this.garage = garage;
        this.garden = garden;
        this.pool = pool;
        this.statues = statues;
    }
    public boolean hasGarage() {
        return garage;
    }

    public boolean hasGarden() {
        return garden;
    }

    public boolean hasPool() {
    return pool;
    }

    public boolean hasStatues() {
        return statues;
    }

    @Override
    public String toString() {
        return "House{" +
                "garage=" + garage +
                ", garden=" + garden +
                ", pool=" + pool +
                ", statues=" + statues+
                '}';
    }
}