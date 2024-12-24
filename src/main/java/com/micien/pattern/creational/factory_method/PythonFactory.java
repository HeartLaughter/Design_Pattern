package com.micien.pattern.creational.factory_method;

public class PythonFactory extends VideoFactory {
    @Override
    Video getvideos() {
        return new PythonVideo();
    }
}
