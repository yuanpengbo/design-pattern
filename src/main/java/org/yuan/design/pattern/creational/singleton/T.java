package org.yuan.design.pattern.creational.singleton;

public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
