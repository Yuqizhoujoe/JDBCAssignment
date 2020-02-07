package com.company.example;

public class Student {

    private int StudentID;
    private String Name;
    private String Major;
    private double AcBalance;

    public Student(int StudentID, String Name, String Major, double AcBalance) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.Major = Major;
        this.AcBalance = AcBalance;
    }

    public int getStudentID(){
        return StudentID;
    }

    public void setStudentID(){
        this.StudentID = StudentID;
    }

    public String getName(){
        return Name;
    }

    public void setName(){
        this.Name = Name;
    }

    public String getMajor(){
        return Major;
    }

    public void setMajor(){
        this.Major = Major;
    }

    public double getAcBalance(){
        return AcBalance;
    }

    public void setAcBalance(){
        this.AcBalance = AcBalance;
    }

}
