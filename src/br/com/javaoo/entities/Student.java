package br.com.javaoo.entities;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public void setName(String name){
        this.name = name;
    }

    public void setGrade1(double grade){
        this.grade1 = grade;
    }

    public void setGrade2(double grade){
        this.grade2 = grade;
    }

    public void setGrade3(double grade){
        this.grade3 = grade;
    }

    public double resultado(){
        return grade1 + grade2 + grade3;
    }

    public void statusAluno(){
        if (resultado() >= 60.0){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.0 - resultado());
        }
    }

}
