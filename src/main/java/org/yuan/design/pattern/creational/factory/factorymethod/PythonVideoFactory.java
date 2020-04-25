package org.yuan.design.pattern.creational.factory.factorymethod;

public class PythonVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
