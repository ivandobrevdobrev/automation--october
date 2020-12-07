package com.lectures.lecture10;

import lombok.Getter;

@Getter
public class StudentMethodReferrence {
    private double avrgGrade;
    private String name;

    public StudentMethodReferrence(double avrgGrade) {
        this.avrgGrade = avrgGrade;
    }

    public StudentMethodReferrence(String name) {
        this.name = name;
    }

    public static int compareGrades(StudentMethodReferrence a, StudentMethodReferrence b) {
        if (a.avrgGrade > b.avrgGrade) return 1;
        else if (a.avrgGrade<b.avrgGrade) return -1;
        return 0;
    }

}
