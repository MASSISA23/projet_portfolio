package com.rhsaas.staff;

public class BankAccount {
    private Long refCode;
    private String accountNumber;
    private String rib;
    private String iban;
    private String holderBankName;
    private String holderBankAddress;

    public BankAccount() {
        // 
    }

    public BankAccount(Long refCode, String accountNumber, String rib, String iban, String holderBankName, String holderBankAddress) {
        this.refCode = refCode;
        this.accountNumber = accountNumber;
        this.rib = rib;
        this.iban = iban;
        this.holderBankName = holderBankName;
        this.holderBankAddress = holderBankAddress;
    }

    public BankAccount(Long refCode, String accountNumber, String holderBankName) {
        this(refCode, accountNumber, null, null, holderBankName, null);
    }

    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getHolderBankName() {
        return holderBankName;
    }

    public void setHolderBankName(String holderBankName) {
        this.holderBankName = holderBankName;
    }

    public String getHolderBankAddress() {
        return holderBankAddress;
    }

    public void setHolderBankAddress(String holderBankAddress) {
        this.holderBankAddress = holderBankAddress;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "refCode='" + refCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", rib='" + rib + '\'' +
                ", iban='" + iban + '\'' +
                ", holderBankName='" + holderBankName + '\'' +
                ", holderBankAddress='" + holderBankAddress + '\'' +
                '}';
    }
}