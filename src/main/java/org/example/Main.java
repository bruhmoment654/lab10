package org.example;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer();

        lecturer.setName("Ryan Gosling");
        lecturer.setEmail("ryan@gosling.com");
        lecturer.setSsNo(1);
        lecturer.setFieldOfStudy("lection");

        System.out.println(lecturer);

        Course course = new Course();

        course.setHours(50);
        course.setName("course");
        course.setTeaches(List.of(lecturer));

        System.out.println(course);


    }
}
