package com.micien.pattern.creational.factory_method;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
//        Factory Methods
        VideoFactory FEFactory = new FEFactory();
        Video FEVideo = FEFactory.getvideos();
        FEVideo.play();

        VideoFactory PythonFactory = new PythonFactory();
        Video PythonVideo = PythonFactory.getvideos();
        PythonVideo.play();

        VideoFactory JavaFactory = new JavaFactory();
        Video JavaVideo = JavaFactory.getvideos();
        JavaVideo.play();
//        Any other courses, you can extends course class, without changing any current codes.



//        without factory
//        Video video = new JavaVideo();
//        video.play();

//        with factory
//        VideoFactory factory = new VideoFactory();
//        Video javavideo = factory.getVideos(JavaVideo.class);
//        javavideo.play();
//        Video pyvidep = factory.getVideos(PythonVideo.class);
//        pyvidep.play();

    }
}
