package org.yuan.design.pattern.creational.singleton;

public class HungrySingleton {

    //public final static HungrySingleton instance = new HungrySingleton();

    public final static HungrySingleton instance ;

    static {
        instance = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    private HungrySingleton() {
    }


}
