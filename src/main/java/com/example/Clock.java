package com.example;

public class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours=hours;
        this.minutes=minutes;
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60; 
        }
    }
    
    public String getTime() {
        return this.hours + ":" + this.minutes;
    }
    
}
