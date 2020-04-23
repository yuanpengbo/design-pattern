package org.yuan.design.pattern.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;

public class VideoFactory {
    public Video getVideoByReflect(Class c){
        Video video = null;
        try {
            video = (Video) c.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String videoType){
        if("java".equalsIgnoreCase(videoType)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(videoType)){
            return new PythonVideo();
        } else{
            return null;
        }
    }
}
