package com.lectures.lecture10;

public class StudentMethodReferrence {
    private double avrgGrade;

    public StudentMethodReferrence(double avrgGrade) {
        this.avrgGrade = avrgGrade;
    }

    public static int compareGrades(StudentMethodReferrence a, StudentMethodReferrence b) {
        if (a.avrgGrade > b.avrgGrade) return 1;
        else if (a.avrgGrade<b.avrgGrade) return -1;
        return 0;
    }

}
