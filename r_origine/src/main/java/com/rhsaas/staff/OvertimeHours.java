package com.rhsaas.staff;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OvertimeHours {
    private int hours;
    private double hourlyRate;
    private  Employee employee;
    private Date date;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OvertimeHours(int hours, double hourlyRate, Employee employee) {
        this.hours = hours;
        this.hourlyRate = hourlyRate;
        this.date =new Date();
        this.employee = employee;
    }

    public double overtimeAmount() {
        return hours * hourlyRate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        return "OvertimeHours{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                ", employee=" + (employee != null ? employee.getFullName() : "null") +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}