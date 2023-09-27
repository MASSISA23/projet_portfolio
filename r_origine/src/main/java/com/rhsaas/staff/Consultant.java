package com.rhsaas.staff;

import java.math.BigDecimal;
import java.util.Date;

import com.rhsaas.utils.Gender;
import com.rhsaas.utils.MatrimonialStatus;
import com.rhsaas.utils.TypeEmployeeEnum;

public class Consultant extends Personal {
    private String expertise;
    private String companyName;

    public Consultant(
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
        String expertise
    ) {
        super(refCode, lastName, firstName, dateOfBirth, gender, personalEmail, professionalEmail, phone, phone1, phone2, adress, emergencyEmail, emergencyPhone, typeEmployee, salary, position, hireDate, endContractDate, matrimonialStatus, bankAccount);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return this.expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return this.toString() + "\n" + 
                 "Expertise: " + this.expertise + "\n" +
                 "Compagnie: " + this.companyName + "\n";

    }
}
