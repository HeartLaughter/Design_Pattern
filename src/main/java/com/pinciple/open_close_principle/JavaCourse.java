package com.pinciple.open_close_principle;

public class JavaCourse implements course {

    int id;
    String name;
    int price;

    public JavaCourse(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
