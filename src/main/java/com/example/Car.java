package com.example;

public class Car {
    private int speed;

    public Car() {
        this.speed=0;
    }

    public void speedUp(int increment) {
        this.speed +=increment;
    }

    public void slowDown(int decrement) {
        this.speed -=decrement;
        if (this.speed<0){
            this.speed +=decrement;
        }
    }
    
    public int currentSpeed() {
        return this.speed;
    }
}
