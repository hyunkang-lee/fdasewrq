package com.hw1.model.dto;

public class Student extends Person {
    private int grade;
    private String major;

    public Student() {

    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }

    public String information() {
        Person ps = new Person();
        return "학생 정보 = " +
                "이름 : " + name +
                ", 나이 : " + getAge() +
                ", 신장 : " + getHeight() +
                ", 몸무게 : " + getWeight() +
                ", 학년 : " + grade +
                ", 전공 : " + major ;
    }



}

