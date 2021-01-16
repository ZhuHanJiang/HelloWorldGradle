package com.haru.kotlin.classConstructors;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
    }

    {
        this.age = age;
    }
}
