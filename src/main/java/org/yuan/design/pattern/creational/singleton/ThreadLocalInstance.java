package org.yuan.design.pattern.creational.singleton;

import java.lang.invoke.VarHandle;

public class ThreadLocalInstance {

    private ThreadLocalInstance(){}

    private static final ThreadLocal<ThreadLocalInstance> INSTANCE_THREAD_LOCAL =new ThreadLocal<>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    public static ThreadLocalInstance getInstance(){
        return INSTANCE_THREAD_LOCAL.get();
    }


}
