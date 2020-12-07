package com.lectures.lecture10;

public class CompareObjects {
    public int compareByNames(StudentMethodReferrence a, StudentMethodReferrence b){
        return a.getName().compareTo(b.getName());
    }
}
