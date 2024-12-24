package com.micien.pattern.structual.decorator;

public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "plus one more susage";
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
