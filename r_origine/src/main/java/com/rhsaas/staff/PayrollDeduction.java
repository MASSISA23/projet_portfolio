package com.rhsaas.staff;

import java.util.Date;

public class PayrollDeduction {
    private Date deductionDate;
    private double amount;
    private Employee employee;

    public PayrollDeduction() {

    }

    public PayrollDeduction(Date deductionDate, double amount) {
        this.deductionDate = deductionDate;
        this.amount = amount;
    }

    public Date getDeductionDate() {
        return deductionDate;
    }

    public void setDeductionDate(Date deductionDate) {
        this.deductionDate = deductionDate;
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
        return "PayrollDeduction{" +
                "deductionDate=" + deductionDate +
                ", amount=" + amount +
                ", employee=" + (employee != null ? employee.getFullName() : "null") +
                '}';
    }
}
