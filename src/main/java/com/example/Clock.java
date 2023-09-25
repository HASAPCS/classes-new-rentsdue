package com.example;

public class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours=hours;
        this.minutes=minutes;
    }

    public void addMinutes(int minutes) {
        this.minutes +=minutes;
        if (this.minutes>=60){
            this.minutes -=60;
            this.hours+=1;
        }
    }
    
    public String getTime() {
        if (this.hours>12){
            this.hours -=12;
            return "0"+this.hours+":"+this.minutes;
        }
    return this.hours+":"+this.minutes;
    }

}
    
