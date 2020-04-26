package org.yuan.design.pattern.creational.builder.v2;

import org.yuan.design.pattern.creational.builder.Coach;
import org.yuan.design.pattern.creational.builder.CourseActualBuilder;
import org.yuan.design.pattern.creational.builder.CourseBuilder;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("java")
                .buildCoursePPT("ppt")
                .buildCourseVideo("video")
                .buildCourseArticle("article")
                .buildCourseQA("QA")
                .build();


        System.out.println(course);
    }
}
