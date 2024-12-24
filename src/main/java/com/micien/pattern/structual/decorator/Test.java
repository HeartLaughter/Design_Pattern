package com.micien.pattern.structual.decorator;

public class Test {
    public static void main(String[] args) {
        AbstractBatterCake batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);

        System.out.println(batterCake.getDescription());
        System.out.println(batterCake.cost());

    }
}
