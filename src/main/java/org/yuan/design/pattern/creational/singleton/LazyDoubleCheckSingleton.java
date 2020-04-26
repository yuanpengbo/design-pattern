package org.yuan.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {

    //volatile 处理重排序问题
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){

        if(lazySingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                    //new 分为三部
                    //1.分配内存空间
                    //2.初始化对象
                    //3.设置对象指向内存空间地址
                    //重排序 2 3 步骤 不是线性执行顺序
                    //volatile 关键字 可以禁止重排序
                }
            }
        }
        return lazySingleton;
    }
}
