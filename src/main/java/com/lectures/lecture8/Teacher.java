package com.lectures.lecture8;

import com.lectures.lecture7.ArrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teacher<lessons, Arraylist> extends Person1 {
    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    private int schoolNumber;

    public List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }

    private String discipline;
    private List<String> lessons;





    public Teacher(String name, int age, int schoolNumber,String discipline) {
        super(name, age);
        this.schoolNumber= schoolNumber;
        this.discipline= discipline;

    }




}
