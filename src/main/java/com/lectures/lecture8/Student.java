package com.lectures.lecture8;

import java.util.List;

public class Student extends Person{
    private String faculty;
    private String speciality;
    private int facultNumber;

    public List<String> getExams() {
        return exams;
    }

    public void setExams(List<String> exams) {
        this.exams = exams;
    }

    private List<String> exams;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getFacultNumber() {
        return facultNumber;
    }

    public void setFacultNumber(int facultNumber) {
        this.facultNumber = facultNumber;
    }

    public Student(String name, int age, String faculty, String speciality, int facultNumber) {
        super(name, age);
        this.faculty= faculty;
        this.facultNumber=facultNumber;
        this.speciality= speciality;
    }
    public void prepareExam(int NumberofExam){
        if(NumberofExam>=5){
            System.out.println("study hard");
        }else{
            System.out.println("party hard");
        }

    }
}
