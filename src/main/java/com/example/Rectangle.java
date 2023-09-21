package com.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    public double area() {
        return this.length*this.width;  // Change this default return statement
    }

    public double perimeter() {
        return 2*(this.length+this.width);
    }
}
