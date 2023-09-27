package com.rhsaas.insurance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.rhsaas.staff.Personal;

public class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private String policyHolderAddress;
    private String policyHolderContact;
    private Date policyStartDate;
    private Date policyEndDate;
    private BigDecimal premiumAmount;
    private String coverageType;
    private BigDecimal coverageAmount;
    private BigDecimal deductible;
    private String policyStatus;
    private ArrayList<Beneficiary> beneficiaries = new ArrayList<>();
    private ArrayList<Payment> paymentHistory;
    private String insuranceCompany;
    private String companyContact;
    private String termsAndConditions;
    private Date renewalDate;
    private boolean isRenewable;
    private Personal personal;

    public InsurancePolicy() {
        //
    }

    public InsurancePolicy(String policyNumber, String policyHolderName, String policyHolderAddress,
                           String policyHolderContact, Date policyStartDate,
                           Date policyEndDate, BigDecimal premiumAmount, String coverageType, BigDecimal coverageAmount,
                           BigDecimal deductible, String policyStatus, String insuranceCompany, String companyContact,
                           String termsAndConditions, Date renewalDate, boolean isRenewable, Personal personal) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.policyHolderAddress = policyHolderAddress;
        this.policyHolderContact = policyHolderContact;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.premiumAmount = premiumAmount;
        this.coverageType = coverageType;
        this.coverageAmount = coverageAmount;
        this.deductible = deductible;
        this.policyStatus = policyStatus;
        this.insuranceCompany = insuranceCompany;
        this.companyContact = companyContact;
        this.termsAndConditions = termsAndConditions;
        this.renewalDate = renewalDate;
        this.isRenewable = isRenewable;
        this.personal = personal;
    }

    public InsurancePolicy(String policyNumber, String policyHolderName, String policyHolderAddress,
                           String policyHolderContact, Date policyStartDate,
                           Date policyEndDate, BigDecimal premiumAmount, String coverageType, BigDecimal coverageAmount,
                           BigDecimal deductible, String policyStatus, String insuranceCompany, String companyContact,
                           String termsAndConditions, Date renewalDate, boolean isRenewable, ArrayList<Beneficiary> beneficiaries,
                           ArrayList<Payment> paymentHistory, Personal personal) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.policyHolderAddress = policyHolderAddress;
        this.policyHolderContact = policyHolderContact;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.premiumAmount = premiumAmount;
        this.coverageType = coverageType;
        this.coverageAmount = coverageAmount;
        this.deductible = deductible;
        this.policyStatus = policyStatus;
        this.beneficiaries = beneficiaries;
        this.paymentHistory = paymentHistory;
        this.insuranceCompany = insuranceCompany;
        this.companyContact = companyContact;
        this.termsAndConditions = termsAndConditions;
        this.renewalDate = renewalDate;
        this.isRenewable = isRenewable;
        this.personal = personal;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyHolderAddress() {
        return policyHolderAddress;
    }

    public void setPolicyHolderAddress(String policyHolderAddress) {
        this.policyHolderAddress = policyHolderAddress;
    }

    public String getPolicyHolderContact() {
        return policyHolderContact;
    }

    public void setPolicyHolderContact(String policyHolderContact) {
        this.policyHolderContact = policyHolderContact;
    }

    public Date getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public BigDecimal getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(BigDecimal premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public BigDecimal getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(BigDecimal coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public BigDecimal getDeductible() {
        return deductible;
    }

    public void setDeductible(BigDecimal deductible) {
        this.deductible = deductible;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public ArrayList<Beneficiary> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(ArrayList<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public ArrayList<Payment> getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(ArrayList<Payment> paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public boolean isRenewable() {
        return isRenewable;
    }

    public void setRenewable(boolean isRenewable) {
        this.isRenewable = isRenewable;
    }

    public Personal getPersonal() {
        return this.personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public double getTotalAmountPaid() {
        return paymentHistory.stream()
                .mapToDouble(payment -> payment.getAmount().doubleValue())
                .sum();
    }
}
