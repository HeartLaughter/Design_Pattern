package com.micien.pattern.creational.simple_factory;

import static java.lang.Class.forName;

public class SimpleFactory {




    public Video getVideos(Class c) {
        //Factory Methods
        Video video = null;
        try {
              video = (Video) forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return video;




        //version1
//        if(videos == null)
//            return null;
//        else if (videos.equals("java")) {
//            return new JavaVideo();
//        }
//        else if (videos.equals("python")) {
//            return new PythonVideo();
//        }
//        return null;
//    }


    }

}
