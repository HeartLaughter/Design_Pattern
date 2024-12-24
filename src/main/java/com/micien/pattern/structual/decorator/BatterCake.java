package com.micien.pattern.structual.decorator;

public class BatterCake extends AbstractBatterCake{
    @Override
    public String getDescription() {
        return "a batter cake";
    }

    @Override
    public double cost() {
        return 8;
    }
}
