package com.micien.pattern.structual.decorator;

public class AbstractDecorator extends AbstractBatterCake{

    private AbstractBatterCake batterCake;
    public AbstractDecorator(AbstractBatterCake batterCake) {
        this.batterCake = batterCake;
    }
    @Override
    public String getDescription() {
        return this.batterCake.getDescription();
    }

    @Override
    public double cost() {
        return this.batterCake.cost();
    }
}
