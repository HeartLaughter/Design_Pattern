package com.micien.pattern.creational.simple_factory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
//        without factory
//        Video video = new JavaVideo();
//        video.play();

//        with factory
        SimpleFactory factory = new SimpleFactory();
        Video javavideo = factory.getVideos(JavaVideo.class);
        javavideo.play();
        Video pyvidep = factory.getVideos(PythonVideo.class);
        pyvidep.play();

    }
}
