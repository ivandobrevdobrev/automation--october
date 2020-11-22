package com.lectures.lecture8;

import java.util.ArrayList;
import java.util.List;

public class MainLecture8 {
    public static void main(String[] args) {
        Student student = new Student("ivan", 25,"QA","softQa",2659);
        List<String> newExams =new ArrayList<String>();
        newExams.add("Math");
        newExams.add("QA");  //сега този лист нямa нищо общшо с Student. Затова по-долу ще му подадем тези exams със set method

student.setExams(newExams); // Using the setter- dobavqme novite exams kym List ot Student clasa
        System.out.println(student.getExams());// s getter-a gi vzimame ot student klasa i gi printirame
    }
}
