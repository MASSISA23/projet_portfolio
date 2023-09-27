package com.rhsaas.insurance;

import com.rhsaas.staff.Personal;

public class Beneficiary {
    private Long beneficiaryId;
    private String beneficiaryName;
    private String email;
    private String phone;
    private String beneficiaryAddress;
    private boolean activeStatus;
    private Personal personal;

    public Beneficiary() {
        // 
    }

    public Beneficiary(Long beneficiaryId, String beneficiaryName, String beneficiaryAddress) {
        this.beneficiaryId = beneficiaryId;
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryAddress = beneficiaryAddress;
    }

    public Long getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Long beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    public void setBeneficiaryAddress(String beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    public Personal getPersonal() {
        return this.personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public boolean getActiveStatus() {
        return this.activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
