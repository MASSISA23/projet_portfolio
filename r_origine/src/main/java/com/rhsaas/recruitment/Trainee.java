package com.rhsaas.recruitment;

import java.util.Date;
import java.util.List;

import com.rhsaas.contracts.TraineeContract;
import com.rhsaas.departments.Departement;
import com.rhsaas.staff.Document;
import com.rhsaas.staff.Personal;
import com.rhsaas.staff.Position;

public class Trainee extends Recruitment {
    private int numberMonthsOfTrainee;
    private String typeOfTrainee;
    private boolean compensationAvailable;
    private Departement departement;
    private TraineeContract traineeContract;

    public Trainee(
        Long refCode, String title, Date dateRequiredOfRecruitment,
        List<Position> positions, List<Departement> departements,
        List<String> specifications, String graduateLevelRequired,
        int numberYearsOfExperienceRequired, int numberYearsOfPoste,
        Date publicationDate, List<Document> documentsRequired,
        List<Personal> monitoringCommittee,
        List<Date> interviewDate,
        int numberMonthsOfTrainee,
        String typeOfTrainee,
        boolean compensationAvailable,
        Departement departement,
        TraineeContract traineeContract
    ) {
        super(
            refCode, title, dateRequiredOfRecruitment, positions, departements,
            specifications, graduateLevelRequired, numberYearsOfExperienceRequired,
            numberYearsOfPoste, publicationDate, documentsRequired, monitoringCommittee,
            interviewDate
        );
        this.numberMonthsOfTrainee = numberMonthsOfTrainee;
        this.typeOfTrainee = typeOfTrainee;
        this.compensationAvailable = compensationAvailable;
        this.departement = departement;
        this.traineeContract = traineeContract;
    }

    public int getNumberMonthsOfTrainee() {
        return numberMonthsOfTrainee;
    }

    public void setNumberMonthsOfTrainee(int numberMonthsOfTrainee) {
        this.numberMonthsOfTrainee = numberMonthsOfTrainee;
    }

    public String getTypeOfTrainee() {
        return typeOfTrainee;
    }

    public void setTypeOfTrainee(String typeOfTrainee) {
        this.typeOfTrainee = typeOfTrainee;
    }

    public boolean isCompensationAvailable() {
        return compensationAvailable;
    }

    public void setCompensationAvailable(boolean compensationAvailable) {
        this.compensationAvailable = compensationAvailable;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public TraineeContract getTraineeContract() {
        return traineeContract;
    }

    public void setTraineeContract(TraineeContract traineeContract) {
        this.traineeContract = traineeContract;
    }
}