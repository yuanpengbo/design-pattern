package org.yuan.design.pattern.creational.factory.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video java = videoFactory.getVideo();
        java.produce();

        videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }
}
