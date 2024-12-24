package com.pinciple.open_close_principle;

public class DiscountJavaClass extends JavaCourse {



    public DiscountJavaClass(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.8;
    }

    public double getOriginalPrice() {
        return super.getPrice();
    }
}
