package com.micien.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder {

    Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCourseCode(String courseCode) {
        course.setCourseCode(courseCode);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);

    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);

    }

    @Override
    public void courseQA(String courseQA) {
        course.setCourseQA(courseQA);

    }

    @Override
    public void coursePPT(String coursePPT) {

    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
