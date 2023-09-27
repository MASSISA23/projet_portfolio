package com.rhsaas.staff;

import java.util.Date;
import java.util.List;

public class Mission {
    private String missionName;
    private Date startDate;
    private Date endDate;
    private List<Employee> assignedEmployes;
    private double budget;
    private boolean completed;

    public Mission() {
        this.completed = false;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Employee> getAssignedEmployes() {
        return assignedEmployes;
    }

    public void setAssignedEmployes(List<Employee> assignedEmployes) {
        this.assignedEmployes = assignedEmployes;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Mission(String missionName, Date startDate, Date endDate, List<Employee> assignedEmployes, double budget) {
        this.missionName = missionName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.assignedEmployes = assignedEmployes;
        this.budget = budget;
        this.completed = false;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public void addEmploye(Employee employe) {
        assignedEmployes.add(employe);
    }

    public long calculateMissionDurationInDays() {
        long durationInMilliseconds = endDate.getTime() - startDate.getTime();
        return durationInMilliseconds / (24 * 60 * 60 * 1000);
    }

    public String getMissionName() {
        return missionName;
    }
}
