package org.airline;

abstract class Person {
    int age;
    String name;
    double height;
    double weight;

    public Person(int age, String name, double height, double weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
