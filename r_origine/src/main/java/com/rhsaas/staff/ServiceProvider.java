package com.rhsaas.staff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.rhsaas.utils.Gender;
import com.rhsaas.utils.MatrimonialStatus;
import com.rhsaas.utils.TypeEmployeeEnum;

public class ServiceProvider extends Personal {
    private static int totalCount = 0;
    private static ArrayList<String> listServices;
    private static ArrayList<String> providersCompanyName;


    private String service;
    private String serviceDescription;
    private String companyName;
    private Date serviceStartDate;
    private Date serviceEndDate;
    private String fiscalIdenticationNumber;
    private BigDecimal serviceAmount;
    private String companyCeo;
    private String companyAdress;


    public ServiceProvider(
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
        String service,
        String serviceDescription,
        String companyName,
        Date serviceStartDate,
        Date serviceEndDate,
        String fiscalIdenticationNumber,
        BigDecimal serviceAmount,
        String companyCeo,
        String companyAdress
    ) {
        super(refCode, lastName, firstName, dateOfBirth, gender, personalEmail, professionalEmail, phone, phone1, phone2, companyAdress, emergencyEmail, emergencyPhone, typeEmployee, salary, position, hireDate, endContractDate, matrimonialStatus, bankAccount);
        this.service = service;
        this.serviceDescription = serviceDescription;
        this.companyName = companyName;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
        this.fiscalIdenticationNumber = fiscalIdenticationNumber;
        this.serviceAmount = serviceAmount;
        this.companyCeo = companyCeo;
        this.companyAdress = companyAdress;

        totalCount++;
        listServices.add(service);
        providersCompanyName.add(companyName);
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getServiceStartDate() {
        return this.serviceStartDate;
    }

    public void setServiceStartDate(Date serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public Date getServiceEndDate() {
        return this.serviceEndDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public String getFiscalIdenticationNumber() {
        return this.fiscalIdenticationNumber;
    }

    public void setFiscalIdenticationNumber(String fiscalIdenticationNumber) {
        this.fiscalIdenticationNumber = fiscalIdenticationNumber;
    }

    public BigDecimal getServiceAmount() {
        return this.serviceAmount;
    }

    public void setServiceAmount(BigDecimal serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public String getCompanyCeo() {
        return this.companyCeo;
    }

    public void setCompanyCeo(String companyCeo) {
        this.companyCeo = companyCeo;
    }

    public String getCompanyAdress() {
        return this.companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}