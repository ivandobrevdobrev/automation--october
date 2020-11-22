package com.lectures.lecture8;

public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age){
        this.name=name;
        this.age = age;
    }
    public void LevelOfEducation(EducationLevel educationLevel) {
        switch ((educationLevel)) {
            case NO:
                System.out.println("Person has no edu");
            case BASIC:
                System.out.println(" Person has basic level of eduaction");
            case High_SCHOOL:
                System.out.println(" Person has High school level of eduaction");
            case UNI:
                System.out.println(" Person has UNI level of eduaction");
        }
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
