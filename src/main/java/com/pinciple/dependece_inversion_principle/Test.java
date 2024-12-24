package com.pinciple.dependece_inversion_principle;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        //v1 new methonds rely on the implementation of inner Geely class implementation.
//        Geely geely = new Geely();
//        geely.learnJava();
//        geely.learnPython();



        //v2 interface oriented programming
        Geely geely = new Geely();
        geely.studyCourse(new JavaCourse());
        geely.studyCourse(new PythonCourse());
    }
}
