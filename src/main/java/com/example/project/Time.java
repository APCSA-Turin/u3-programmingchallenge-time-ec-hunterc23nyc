package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hour = 0;
    private int minute = 0;
    private int seconds = 0;
    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)

    public Time(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }


    public String info(){
        return hour + ":" + minute + ":" + seconds;
    }


    public void tick(){
        seconds += 1;
        if (seconds == 60){
            seconds = 0;
            minute += 1;
            if (minute == 60){
                minute = 0;
                hour += 1;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
    }


    public void add(Time time2){
        this.seconds += time2.seconds;
        this.minute += time2.minute;
        this.hour += time2.hour;
        if (this.seconds >= 60){
            this.seconds -= 60;
            this.minute++;
        }
        if (this.minute >= 60){
            this.minute -= 60;
            this.hour++;
        }
        if (this.hour >= 24){
            this.hour -= 24;
        }
    }
    }


