package org.yuan.design.pattern.creational.factory.factorymethod;

public class JavaVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
