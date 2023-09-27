package com.rhsaas.staff;

import java.util.Date;

public class KeyPerformanceIndicatorMeasurement {
    private Long refCode;
    private Date measurementDate;
    private double measureValue;
    private String comments;

    public KeyPerformanceIndicatorMeasurement() {
        //
    }

    public KeyPerformanceIndicatorMeasurement(Long refCode, Date measurementDate, double measureValue, String comments) {
        this.refCode = refCode;
        this.measurementDate = measurementDate;
        this.measureValue = measureValue;
        this.comments = comments;
    }

    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public Date getMeasurementDate() {
        return measurementDate;
    }

    public void setMeasurementDate(Date measurementDate) {
        this.measurementDate = measurementDate;
    }

    public double getMeasureValue() {
        return measureValue;
    }

    public void setMeasureValue(double measureValue) {
        this.measureValue = measureValue;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
