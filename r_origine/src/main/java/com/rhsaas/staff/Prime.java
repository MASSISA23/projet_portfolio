package com.rhsaas.staff;

import java.util.Date;

public class Prime {
    private Date awardDate;
    private double amount;
    private Employee employee;

    public Prime() {
        //
    }

    public Prime(Date awardDate, double amount) {
        this.awardDate = awardDate;
        this.amount = amount;
    }

    public Date getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(Date awardDate) {
        this.awardDate = awardDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Prime{" +
                "awardDate=" + awardDate +
                ", amount=" + amount +
                ", employee=" + (employee != null ? employee.getFullName() : "null") +
                '}';
    }

}
