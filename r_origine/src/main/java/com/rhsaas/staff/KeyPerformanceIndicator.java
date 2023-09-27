package com.rhsaas.staff;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class KeyPerformanceIndicator {
    private Long refCode;
    private String kpiName;
    private String kpiDescription;
    private double targetValue;
    private double actualValue;
    private Date createdAt;
    private Date updatedAt;
    private String kpiStatus;
    private double kpiWeight;
    private double belowTargetThreshold;
    private double onTargetThreshold;
    private double aboveTargetThreshold;
    private String comments;
    private Employee reportingManager;
    private Position position;
    private List<KeyPerformanceIndicatorMeasurement> measurements = new ArrayList<>();

    // Constructors
    public KeyPerformanceIndicator() {
        // Default constructor
    }

    public KeyPerformanceIndicator(Long refCode, String kpiName, String kpiDescription, double targetValue, double actualValue,
            Date createdAt, Date updatedAt, String kpiStatus, double kpiWeight, double belowTargetThreshold,
            double onTargetThreshold, double aboveTargetThreshold, String comments, Employee reportingManager,
            Position position, List<KeyPerformanceIndicatorMeasurement> measurements) {
        this.refCode = refCode;
        this.kpiName = kpiName;
        this.kpiDescription = kpiDescription;
        this.targetValue = targetValue;
        this.actualValue = actualValue;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.kpiStatus = kpiStatus;
        this.kpiWeight = kpiWeight;
        this.belowTargetThreshold = belowTargetThreshold;
        this.onTargetThreshold = onTargetThreshold;
        this.aboveTargetThreshold = aboveTargetThreshold;
        this.comments = comments;
        this.reportingManager = reportingManager;
        this.position = position;
        this.measurements = measurements;
    }

    // Getter and Setter methods
    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public String getKpiName() {
        return kpiName;
    }

    public void setKpiName(String kpiName) {
        this.kpiName = kpiName;
    }

    public String getKpiDescription() {
        return kpiDescription;
    }

    public void setKpiDescription(String kpiDescription) {
        this.kpiDescription = kpiDescription;
    }

    public double getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(double targetValue) {
        this.targetValue = targetValue;
    }

    public double getActualValue() {
        return actualValue;
    }

    public void setActualValue(double actualValue) {
        this.actualValue = actualValue;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getKpiStatus() {
        return kpiStatus;
    }

    public void setKpiStatus(String kpiStatus) {
        this.kpiStatus = kpiStatus;
    }

    public double getKpiWeight() {
        return kpiWeight;
    }

    public void setKpiWeight(double kpiWeight) {
        this.kpiWeight = kpiWeight;
    }

    public double getBelowTargetThreshold() {
        return belowTargetThreshold;
    }

    public void setBelowTargetThreshold(double belowTargetThreshold) {
        this.belowTargetThreshold = belowTargetThreshold;
    }

    public double getOnTargetThreshold() {
        return onTargetThreshold;
    }

    public void setOnTargetThreshold(double onTargetThreshold) {
        this.onTargetThreshold = onTargetThreshold;
    }

    public double getAboveTargetThreshold() {
        return aboveTargetThreshold;
    }

    public void setAboveTargetThreshold(double aboveTargetThreshold) {
        this.aboveTargetThreshold = aboveTargetThreshold;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Employee getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(Employee reportingManager) {
        this.reportingManager = reportingManager;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<KeyPerformanceIndicatorMeasurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<KeyPerformanceIndicatorMeasurement> measurements) {
        this.measurements = measurements;
    }
}
