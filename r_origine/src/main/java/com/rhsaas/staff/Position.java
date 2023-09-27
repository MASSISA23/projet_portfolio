package com.rhsaas.staff;

import java.util.ArrayList;
import java.util.Date;

import com.rhsaas.departments.Departement;

public class Position {
    private Long refCode;
    private String title;
    private String description;
    private Date startWorkingAt;
    private Employee employee;
    private Departement department;
    private String seniorityLevel;
    private String specifications;
    private String roadmap;
    private int numberYearsExperienceRequired;
    private Employee manager;
    private boolean isSeniorExecutive = false;
    private ArrayList<Responsability> responsabilities = new ArrayList<>();
    private ArrayList<Skill> skills = new ArrayList<>();
    private ArrayList<Certification> certifications = new ArrayList<>();


    public Position() {
        //
    }

    public Position(Long refCode, String title, String description, Date startWorkingAt, Employee employee, Departement department,
            String seniorityLevel, String specifications, String roadmap, int numberYearsExperienceRequired,
            Employee manager, boolean isSeniorExecutive, ArrayList<Responsability> responsabilities) {
        this.refCode = refCode;
        this.title = title;
        this.description = description;
        this.startWorkingAt = startWorkingAt;
        this.employee = employee;
        this.department = department;
        this.seniorityLevel = seniorityLevel;
        this.specifications = specifications;
        this.roadmap = roadmap;
        this.numberYearsExperienceRequired = numberYearsExperienceRequired;
        this.manager = manager;
        this.isSeniorExecutive = isSeniorExecutive;
        this.responsabilities = responsabilities;
    }

    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartWorkingAt() {
        return startWorkingAt;
    }

    public void setStartWorkingAt(Date startWorkingAt) {
        this.startWorkingAt = startWorkingAt;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Departement getDepartment() {
        return department;
    }

    public void setDepartment(Departement department) {
        this.department = department;
    }

    public String getSeniorityLevel() {
        return seniorityLevel;
    }

    public void setSeniorityLevel(String seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getRoadmap() {
        return roadmap;
    }

    public void setRoadmap(String roadmap) {
        this.roadmap = roadmap;
    }

    public int getNumberYearsExperienceRequired() {
        return numberYearsExperienceRequired;
    }

    public void setNumberYearsExperienceRequired(int numberYearsExperienceRequired) {
        this.numberYearsExperienceRequired = numberYearsExperienceRequired;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public boolean isSeniorExecutive() {
        return isSeniorExecutive;
    }

    public void setSeniorExecutive(boolean isSeniorExecutive) {
        this.isSeniorExecutive = isSeniorExecutive;
    }

    public ArrayList<Responsability> getResponsabilities() {
        return this.responsabilities;
    }

    public void setResponsabilities(ArrayList<Responsability> responsabilities) {
        this.responsabilities = responsabilities;
    }

    public ArrayList<Skill> getSkills() {
        return this.skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public ArrayList<Certification> getCertifications() {
        return this.certifications;
    }

    public void setCertifications(ArrayList<Certification> certifications) {
        this.certifications = certifications;
    }

    public void addResponsability(Responsability responsability) {
        this.responsabilities.add(responsability);
    }

    public void removeResponsability(Responsability responsability) {
        this.responsabilities.remove(responsability);
    }

    @Override
    public String toString() {
        return "Position{" +
                "refCode=" + refCode +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startWorkingAt=" + startWorkingAt +
                ", seniorityLevel='" + seniorityLevel + '\'' +
                ", specifications='" + specifications + '\'' +
                ", roadmap='" + roadmap + '\'' +
                ", numberYearsExperienceRequired=" + numberYearsExperienceRequired +
                ", isSeniorExecutive=" + isSeniorExecutive +
                '}';
    }

}