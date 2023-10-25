package com.example.myapplication;

public class Student {
    public String name = "";
    private double gpa = 0.0;

    Student(String name, double gpa){
        this.gpa = gpa;
        this.name = name;
    }

    public double getGpa(){
        return gpa;
    }

}
