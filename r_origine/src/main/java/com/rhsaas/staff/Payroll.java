package com.rhsaas.staff;

import java.text.SimpleDateFormat;
import java.util.Date;

class Payroll {
    private String month;
    private String ref;
    private Date starting;
    private Date ending;
    private int deduction;
    private long totalworkingHour;
    private double netWages;
    private double grossWages;
    private Date payrollDate;
    private boolean paid;
    private Employee employe;


    public Payroll(Date starting, Date ending, Employee employe) {
        this.starting = starting;
        this.ending = ending;
        this.employe = employe;
    }

    public Payroll(String month, String ref, Date starting, Date ending, int deduction, int totalworkingHour, int netWages, int grossWages, Date payrollDate, boolean paid, Employee employe) {
        this.month = month;
        this.ref = ref;
        this.starting = starting;
        this.ending = ending;
        this.deduction = deduction;
        this.totalworkingHour = totalworkingHour;
        this.netWages = netWages;
        this.grossWages = grossWages;
        this.payrollDate = payrollDate;
        this.paid = paid;
        this.employe = employe;
    }


    public void generatePayroll() {
       Date from=this.starting;
       Date to=this.ending;
        this.totalworkingHour=this.employe.totalAttendance(from,to);
        this.grossWages = (this.totalworkingHour * this.employe.getHourlyRate()) + this.employe.overtimeTotalAmountByDate(from,to);
        this.netWages = this.grossWages - this.deduction;
    }

    public void paid() {
        this.paid = true;
    }
    public boolean isPaid() {
        return this.paid;
    }


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getStarting() {
        return starting;
    }

    public void setStarting(Date starting) {
        this.starting = starting;
    }

    public Date getEnding() {
        return ending;
    }

    public void setEnding(Date ending) {
        this.ending = ending;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public void setTotalworkingHour(long totalworkingHour) {
        this.totalworkingHour = totalworkingHour;
    }

    public void setNetWages(double netWages) {
        this.netWages = netWages;
    }

    public void setGrossWages(double grossWages) {
        this.grossWages = grossWages;
    }

    public long getTotalworkingHour() {
        return totalworkingHour;
    }

    public void setTotalworkingHour(int totalworkingHour) {
        this.totalworkingHour = totalworkingHour;
    }

    public double getNetWages() {
        return netWages;
    }

    public void setNetWages(int netWages) {
        this.netWages = netWages;
    }

    public double getGrossWages() {
        return grossWages;
    }

    public void setGrossWages(int grossWages) {
        this.grossWages = grossWages;
    }

    public Date getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate(Date payrollDate) {
        this.payrollDate = payrollDate;
    }

    public Employee getEmploye() {
        return employe;
    }

    public void setEmploye(Employee employe) {
        this.employe = employe;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        return "Payroll{" +
                "month='" + month + '\'' +
                ", ref='" + ref + '\'' +
                ", starting=" + dateFormat.format(starting) +
                ", ending=" + dateFormat.format(ending) +
                ", deduction=" + deduction +
                ", totalworkingHour=" + totalworkingHour +
                ", netWages=" + netWages +
                ", grossWages=" + grossWages +
                ", payrollDate=" + dateFormat.format(payrollDate) +
                ", paid=" + paid +
                ", employe=" + (employe != null ? employe.getFullName() : "null") +
                '}';
    }
}