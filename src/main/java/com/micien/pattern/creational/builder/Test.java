package com.micien.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("JAVA","J8","PPT",
                "title", "Q|A","DP");
        System.out.println(course);
    }
}
