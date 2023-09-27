package com.rhsaas.staff;

import java.math.BigDecimal;
import java.util.Date;

import com.rhsaas.departments.Departement;
import com.rhsaas.utils.Gender;
import com.rhsaas.utils.MatrimonialStatus;
import com.rhsaas.utils.TrainingType;
import com.rhsaas.utils.TypeEmployeeEnum;

public class Trainee extends Personal {
    private BigDecimal compensation;
    private Employee trainingSupervisor;
    private TrainingType trainingType;
    private String traineeTitle;
    private Date traineeStartDate;
    private Date traineeEndDate;
    private Departement departement;

    public Trainee
    (
        String refCode, 
        String lastName, 
        String firstName, 
        Date dateOfBirth, 
        Gender gender, 
        String personalEmail, 
        String professionalEmail, 
        String phone,
        String phone1,
        String phone2,
        String adress,
        String emergencyEmail,
        String emergencyPhone,
        TypeEmployeeEnum typeEmployee,
        BigDecimal salary,
        String position,
        Date hireDate,
        Date endContractDate,
        MatrimonialStatus matrimonialStatus,
        BankAccount bankAccount,
        BigDecimal compensation,
        TrainingType trainingType,
        String traineeTitle,
        Date traineeStartDate,
        Date traineeEndDate
    ) {
        super(refCode, lastName, firstName, dateOfBirth, gender, personalEmail, professionalEmail, phone, phone1, phone2, adress, emergencyEmail, emergencyPhone, typeEmployee, salary, position, hireDate, endContractDate, matrimonialStatus, bankAccount);
        this.compensation = compensation;
        this.trainingType = trainingType;
        this.traineeTitle = traineeTitle;
        this.traineeStartDate = traineeStartDate;
        this.traineeEndDate = traineeEndDate;
    }

    public BigDecimal getCompensation() {
        return this.compensation;
    }

    public void setCompensation(BigDecimal compensation) {
        this.compensation = compensation;
    }

    public Employee getTrainingSupervisor() {
        return this.trainingSupervisor;
    }

    public void setTrainingSupervisor(Employee trainingSupervisor) {
        this.trainingSupervisor = trainingSupervisor;
    }

    public TrainingType getTrainingType() {
        return this.trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public String trainingTitle() {
        return this.traineeTitle;
    }

    public Date getTraineeStartDate() {
        return this.traineeStartDate;
    }

    public void setTrainingStartDate(Date traineeStartDate) {
        this.traineeStartDate = traineeStartDate;
    }

    public Date getTraineeEndDate() {
        return this.traineeEndDate;
    }

    public void setTrainingEndDate(Date traineeEndDate) {
        this.traineeEndDate = traineeEndDate;
    }

    public Departement getDepartement() {
        return this.departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}