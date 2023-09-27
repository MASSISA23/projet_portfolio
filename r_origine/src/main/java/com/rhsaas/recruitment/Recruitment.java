package com.rhsaas.recruitment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rhsaas.departments.Departement;
import com.rhsaas.staff.Document;
import com.rhsaas.staff.Personal;
import com.rhsaas.staff.Position;

public abstract class Recruitment {
    private Long refCode;
    private String title;
    private Date dateRequiredOfRecruitment;
    private ArrayList<Position> positions = new ArrayList<>();
    private ArrayList<Departement> departements = new ArrayList<>();
    private List<String> specifications;
    private String graduateLevelRequired;
    private int numberYearsOfExperienceRequired;
    private int numberYearsOfPoste;
    private Date publicationDate;
    private ArrayList<Document> documentsRequired = new ArrayList<>();
    private ArrayList<Personal> monitoringCommittee = new ArrayList<>();
    private List<Date> interviewDate;

    public Recruitment() {
        //
    }

    public Recruitment(Long refCode, String title, Date dateRequiredOfRecruitment,
            List<Position> positions, List<Departement> departements,
            List<String> specifications, String graduateLevelRequired,
            int numberYearsOfExperienceRequired, int numberYearsOfPoste,
            Date publicationDate, List<Document> documentsRequired,
            List<Personal> monitoringCommittee,
            List<Date> interviewDate) {
        this.refCode = refCode;
        this.title = title;
        this.dateRequiredOfRecruitment = dateRequiredOfRecruitment;
        this.positions.addAll(positions);
        this.departements.addAll(departements);
        this.specifications = specifications;
        this.graduateLevelRequired = graduateLevelRequired;
        this.numberYearsOfExperienceRequired = numberYearsOfExperienceRequired;
        this.numberYearsOfPoste = numberYearsOfPoste;
        this.publicationDate = publicationDate;
        this.documentsRequired.addAll(documentsRequired);
        this.monitoringCommittee.addAll(monitoringCommittee);
        this.interviewDate = interviewDate;
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

    public Date getDateRequiredOfRecruitment() {
        return dateRequiredOfRecruitment;
    }

    public void setDateRequiredOfRecruitment(Date dateRequiredOfRecruitment) {
        this.dateRequiredOfRecruitment = dateRequiredOfRecruitment;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions.clear();
        this.positions.addAll(positions);
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements.clear();
        this.departements.addAll(departements);
    }

    public List<String> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<String> specifications) {
        this.specifications = specifications;
    }

    public String getGraduateLevelRequired() {
        return graduateLevelRequired;
    }

    public void setGraduateLevelRequired(String graduateLevelRequired) {
        this.graduateLevelRequired = graduateLevelRequired;
    }

    public int getNumberYearsOfExperienceRequired() {
        return numberYearsOfExperienceRequired;
    }

    public void setNumberYearsOfExperienceRequired(int numberYearsOfExperienceRequired) {
        this.numberYearsOfExperienceRequired = numberYearsOfExperienceRequired;
    }

    public int getNumberYearsOfPoste() {
        return numberYearsOfPoste;
    }

    public void setNumberYearsOfPoste(int numberYearsOfPoste) {
        this.numberYearsOfPoste = numberYearsOfPoste;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<Document> getDocumentsRequired() {
        return documentsRequired;
    }

    public void setDocumentsRequired(List<Document> documentsRequired) {
        this.documentsRequired.clear();
        this.documentsRequired.addAll(documentsRequired);
    }

    public List<Personal> getMonitoringCommittee() {
        return monitoringCommittee;
    }

    public void setMonitoringCommittee(List<Personal> monitoringCommittee) {
        this.monitoringCommittee.clear();
        this.monitoringCommittee.addAll(monitoringCommittee);
    }

    public List<Date> getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(List<Date> interviewDate) {
        this.interviewDate = interviewDate;
    }
}
