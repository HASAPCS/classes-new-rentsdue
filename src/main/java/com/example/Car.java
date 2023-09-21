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
        if (this.speed-decrement<0){
            this.speed=speed;
        }
    }

    public int currentSpeed() {
        return this.speed;
    }
}
