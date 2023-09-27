package com.rhsaas.contracts;

import java.util.Date;

public abstract class Contract {
    private Long refCode;
    private Date signatureDate;
    private String termsAndConditions;
    private String status;
    private String jobTitle;

    public Contract() {

    }

    public Contract(Long refCode, Date signatureDate, String termsAndConditions, String status, String jobTitle) {
        this.refCode = refCode;
        this.signatureDate = signatureDate;
        this.termsAndConditions = termsAndConditions;
        this.status = status;
        this.jobTitle = jobTitle;
    }

    public Long getRefCode() {
        return this.refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public Date getSignatureDate() {
        return this.signatureDate;
    }

    public void setSignatureDate(Date signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "refCode=" + refCode +
                ", signatureDate=" + signatureDate +
                ", termsAndConditions='" + termsAndConditions + '\'' +
                ", status='" + status + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}