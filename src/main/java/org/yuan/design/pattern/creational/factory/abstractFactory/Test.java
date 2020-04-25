package org.yuan.design.pattern.creational.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
       CourseFactory courseFactory = new JavaCourseFactory();
       courseFactory.getArticle().produce();
       courseFactory.getVideo().produce();

        courseFactory = new PythonCourseFactory();
        courseFactory.getArticle().produce();
        courseFactory.getVideo().produce();

    }
}
