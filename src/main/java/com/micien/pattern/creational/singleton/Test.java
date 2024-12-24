package com.micien.pattern.creational.singleton;

public class Test {
    public static void main(String[] args) {
/*        T t1 = new T();
        T t2 = new T();*/
        Thread t1 = new Thread( new T());
        Thread t2 = new Thread( new T());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
