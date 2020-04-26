package org.yuan.design.pattern.creational.builder;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder  = new CourseActualBuilder();
        Coach coach = new Coach();

        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java", "javaPPT", "javaVideo",
                "java article", "java QA");
        System.out.println(course);


    }
}
