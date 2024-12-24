package com.micien.pattern.structual.composition;

public class Course extends CatalogComponent {

    private String courseName;
    private int price;

    public Course(String courseName, int price) {
        this.courseName = courseName;
        this.price = price;
    }

    @Override
    public void print(CatalogComponent catalogComponent) {
        System.out.println(courseName + ":" + price);
    }
}
