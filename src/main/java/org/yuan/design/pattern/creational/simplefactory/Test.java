package org.yuan.design.pattern.creational.simplefactory;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo("java");
        java.produce();

        Video video = videoFactory.getVideoByReflect(PythonVideo.class);
        video.produce();

    }
}
