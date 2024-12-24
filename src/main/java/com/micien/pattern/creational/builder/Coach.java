package com.micien.pattern.creational.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String courseCode,
    String coursePPT, String courseArticle, String courseQA, String courseVideo) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCourseCode(courseCode);
        this.courseBuilder.coursePPT(coursePPT);
        this.courseBuilder.courseQA(courseQA);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseVideo(courseVideo);
        return this.courseBuilder.makeCourse();
    }
}
