package com.rhsaas.staff;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Attendance {
    private Employee employe;
    private Date date;
    private boolean present;
    private LocalTime arrival;
    private LocalTime departure;
    private long workinghours;

    public Attendance() {

    }

    public Attendance(Employee employe) {
        this.employe = employe;
        this.date= new Date();
        this.arrival= LocalTime.now();
    }

    public Employee getEmploye() {
        return employe;
    }

    public void setEmploye(Employee employe) {
        this.employe = employe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public long getWorkinghours() {
        return workinghours;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public LocalTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalTime arrival) {
        this.arrival = arrival;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
        long hours;
        if(this.arrival != null && this.departure != null){
            hours = ChronoUnit.MINUTES.between(this.arrival, this.departure);
            if ((hours%60)!=0) {
                this.workinghours = (hours / 60) + 1;
            }else{
                this.workinghours =  hours / 60;
            }

        } else {
            this.workinghours = 0;
        }
    }
}