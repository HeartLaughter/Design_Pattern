package com.micien.pattern.creational.builder;

public abstract class CourseBuilder {

//    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseArticle;
//    private String courseQA;
    public abstract void buildCourseName(String courseName);
    public abstract void buildCourseCode(String courseCode);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void courseQA(String courseQA);
    public abstract void coursePPT(String coursePPT);

    public abstract Course makeCourse();




}
