package org.yuan.design.pattern.creational.singleton;

import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public final class ContainerSingelton {

    private ContainerSingelton(){

    }

    private static final Map<Class,Object> instances = new HashMap<>();

    public static void putInstance(Class key ,Object object ){
        synchronized (instances){
            if(!instances.containsKey(key)){
                instances.put(key,object);
            }
        }
    }

    public static Object getInstance(Class key){
        if(instances.containsKey(key)){
            return  instances.get(key);
        }
        return null;
    }
}
