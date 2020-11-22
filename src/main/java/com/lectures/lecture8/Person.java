package com.lectures.lecture8;

public class Person {
    private String name;// name can be used only in this class as it is "private"
    private int age;
    private ContactInfo contactInfo; //Has-A, create object from Class Conatctinfo, Person has ContactInfo( aggregation)
public Person (String name, int age){
    this.name= name;
    this.age=age;
}
public void LevelOfEducation(EducationLevel educationLevel){
switch ((educationLevel)){
    case NO:
        System.out.println("Person has no edu");
}
}
}

