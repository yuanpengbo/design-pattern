package org.yuan.design.pattern.creational.abstractFactory;

import org.yuan.design.pattern.creational.factorymethod.JavaVideoFactory;
import org.yuan.design.pattern.creational.factorymethod.PythonVideoFactory;
import org.yuan.design.pattern.creational.factorymethod.Video;
import org.yuan.design.pattern.creational.factorymethod.VideoFactory;

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
