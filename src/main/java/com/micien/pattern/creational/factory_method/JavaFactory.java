package com.micien.pattern.creational.factory_method;

public class JavaFactory extends VideoFactory {
    @Override
    Video getvideos() {
        return new JavaVideo();
    }
}
