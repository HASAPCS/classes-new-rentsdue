package com.example;

public class Student {
    private int score;

    public Student(int score) {
        this.score=score;
    }

    public String grade() {
        if (90<=this.score && this.score<=100){
            return "A";
        } else if (80<=this.score && this.score<=89){
            return "B";
        } else if (70<=this.score && this.score<=79){
            return "C";
        } else if (60<=this.score && this.score<=69){
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isPassing() {
        if (this.score>=60){
            return true;
        } else {
            return false;
        }
    }
}
