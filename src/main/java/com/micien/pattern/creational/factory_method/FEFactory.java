package com.micien.pattern.creational.factory_method;

public class FEFactory extends VideoFactory {
    @Override
    Video getvideos() {
        return new FEVideo();
    }
}
