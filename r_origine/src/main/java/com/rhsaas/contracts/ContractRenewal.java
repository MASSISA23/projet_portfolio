package com.rhsaas.contracts;

import java.math.BigDecimal;
import java.util.Date;

public class ContractRenewal {
    private Long refCode;
    private Date dateOfRenewal;
    private String reason;
    private Contract contract;
    private BigDecimal salary;

    public ContractRenewal() {
        
    }

    public ContractRenewal(Long refCode, Date dateOfRenewal, String reason, Contract contract, BigDecimal salary) {
        this.refCode = refCode;
        this.dateOfRenewal = dateOfRenewal;
        this.reason = reason;
        this.contract = contract;
        this.salary = salary;
    }

    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public Date getDateOfRenewal() {
        return dateOfRenewal;
    }

    public void setDateOfRenewal(Date dateOfRenewal) {
        this.dateOfRenewal = dateOfRenewal;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ContractRenewal [refCode=" + refCode + ", dateOfRenewal=" + dateOfRenewal + ", reason=" + reason
                + ", contract=" + contract + ", salary=" + salary + "]";
    }
}