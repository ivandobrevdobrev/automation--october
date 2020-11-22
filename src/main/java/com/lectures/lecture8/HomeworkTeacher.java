package com.lectures.lecture8;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class HomeworkTeacher {


    public static void main(String[] args) {
        Teacher teacher= new Teacher("Ivan",34,56898, "Literature");
        teacher.LevelOfEducation(EducationLevel.UNI);
        ArrayList<String> newLessons = new ArrayList<String>();
        newLessons.add("Maths");
        newLessons.add("Litearrure");

        teacher.setLessons(newLessons);
        System.out.println(teacher.getLessons());









    }
}