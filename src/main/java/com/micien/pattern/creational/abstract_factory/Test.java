package com.micien.pattern.creational.abstract_factory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getArticle();
        courseFactory.getVideo();
        //no need new javacoursevideo, all handle by facotry
        Article article = courseFactory.getArticle();
        article.produce();
    }
}
