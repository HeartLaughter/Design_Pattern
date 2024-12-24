package com.pinciple.dependece_inversion_principle;

public class PythonCourse implements course{
    @Override
    public void studyCourse() {
        System.out.println("Python course");
    }
}
