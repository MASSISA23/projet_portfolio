package com.rhsaas.contracts;

import java.math.BigDecimal;
import java.util.Date;

public class ContractBreaking {
    private Long refCode;
    private Date dateOfBreaking;
    private String reason;
    private String details;
    private Contract contract;
    private BigDecimal indemnity;

    public ContractBreaking() {
        
    }

    public ContractBreaking(Long refCode, Date dateOfBreaking, String reason, String details, Contract contract, BigDecimal indemnity) {
        this.refCode = refCode;
        this.dateOfBreaking = dateOfBreaking;
        this.reason = reason;
        this.details = details;
        this.contract = contract;
        this.indemnity = indemnity;
    }

    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public Date getDateOfBreaking() {
        return dateOfBreaking;
    }

    public void setDateOfBreaking(Date dateOfBreaking) {
        this.dateOfBreaking = dateOfBreaking;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public BigDecimal getIndemnity() {
        return indemnity;
    }

    public void setIndemnity(BigDecimal indemnity) {
        this.indemnity = indemnity;
    }

    @Override
    public String toString() {
        return "ContractBreaking [refCode=" + refCode + ", dateOfBreaking=" + dateOfBreaking + ", reason=" + reason
                + ", details=" + details + ", contract=" + contract + ", indemnity=" + indemnity + "]";
    }
}