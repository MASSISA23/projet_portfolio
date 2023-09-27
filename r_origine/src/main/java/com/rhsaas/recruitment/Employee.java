package com.rhsaas.recruitment;

import java.util.ArrayList;
import java.util.Date;

import com.rhsaas.contracts.Contract;
import com.rhsaas.departments.Departement;
import com.rhsaas.staff.Document;
import com.rhsaas.staff.Personal;
import com.rhsaas.staff.Position;

public class Employee extends Recruitment {
    private Contract contract;
    private Departement departement;
    private boolean testingRequired;

    public Employee(
        Long refCode, String title, Date dateRequiredOfRecruitment,
        ArrayList<Position> positions, ArrayList<Departement> departements,
        ArrayList<String> specifications, String graduateLevelRequired,
        int numberYearsOfExperienceRequired, int numberYearsOfPoste,
        Date publicationDate, ArrayList<Document> documentsRequired,
        ArrayList<Personal> monitoringCommittee, ArrayList<Date> interviewDate,
        Contract contract, Departement departement, boolean testingRequired
    ) {
        super(
            refCode, title, dateRequiredOfRecruitment, positions,
            departements, specifications, graduateLevelRequired,
            numberYearsOfExperienceRequired, numberYearsOfPoste,
            publicationDate, documentsRequired, monitoringCommittee,
            interviewDate
        );
        this.contract = contract;
        this.departement = departement;
        this.testingRequired = testingRequired;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public boolean isTestingRequired() {
        return testingRequired;
    }

    public void setTestingRequired(boolean testingRequired) {
        this.testingRequired = testingRequired;
    }
}
