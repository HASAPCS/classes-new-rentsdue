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
            this.minutes -=60;
            this.hours +=1;
        }
    }
    
    public String getTime() {
        if (this.hours >= 12) {
            this.hours -= 12;
            if (this.hours >= 10){
                return this.hours + ":" + this.minutes;
            } else {
                String hoursString = Integer.toString(this.hours);
                hoursString = "0" + hoursString;
                return hoursString + ":" + this.minutes;
            }
        }
        return this.hours+":"+this.minutes;
    }
}
    
