package com.micien.pattern.structual.decorator;

public class EggDecorator extends AbstractDecorator{
    public EggDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getDescription() {
        return "an egg";
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }
}
