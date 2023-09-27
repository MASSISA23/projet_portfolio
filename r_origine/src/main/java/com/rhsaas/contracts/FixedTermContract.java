package com.rhsaas.contracts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.rhsaas.staff.Document;
import com.rhsaas.staff.Employee;

public class FixedTermContract extends Contract implements ContractRenewalInterface, ContractBreakingInterface {
    private Date contractEndAt;
    private Document document;
    private String workingsHours;
    private int trialPeriod;
    private BigDecimal salary;
    private String advantages;
    private double salaryTaxRate;
    private double socialSecurityDeductionRate;
    private Employee employee;
    private int counterRenewals = 0;
    private ArrayList<ContractRenewal> renewals = new ArrayList<>();
    private ContractBreaking breaking;

    public FixedTermContract() {

    }

    public FixedTermContract(Long refCode, Date signatureDate, String termsAndConditions, String status, String jobTitle, Date contractEndAt, Document document, String workingsHours, int trialPeriod, BigDecimal salary, String advantages, double salaryTaxRate, double socialSecurityDeductionRate, Employee employee) {
        super(refCode, signatureDate, termsAndConditions, status, jobTitle);
        this.contractEndAt = contractEndAt;
        this.document = document;
        this.workingsHours = workingsHours;
        this.trialPeriod = trialPeriod;
        this.salary = salary;
        this.advantages = advantages;
        this.salaryTaxRate = salaryTaxRate;
        this.socialSecurityDeductionRate = socialSecurityDeductionRate;
        this.employee = employee;
    }

    public Date getContractEndAt() {
        return this.contractEndAt;
    }
    
    public void setContractEndAt(Date contractEndAt) {
        this.contractEndAt = contractEndAt;
    }

    public Document getDocument() {
        return this.document;
    }
    
    public void setDocument(Document document) {
        this.document = document;
    }

    public String getWorkingsHours() {
        return this.workingsHours;
    }
    
    public void setWorkingsHours(String workingsHours) {
        this.workingsHours = workingsHours;
    }

    public int getTrialPeriod() {
        return this.trialPeriod;
    }

    public void setTrialPeriod(int trialPeriod) {
        this.trialPeriod = trialPeriod;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getAdvantages() {
        return this.advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    public double getSalaryTaxRate() {
        return this.salaryTaxRate;
    }

    public void setSalaryTaxRate(double salaryTaxRate) {
        this.salaryTaxRate = salaryTaxRate;
    }

    public double getSocialSecurityDeductionRate() {
        return this.socialSecurityDeductionRate;
    }

    public void setSocialSecurityDeductionRate(double socialSecurityDeductionRate) {
        this.socialSecurityDeductionRate = socialSecurityDeductionRate;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ContractBreaking getBreaking() {
        return this.breaking;
    }

    public void setBreaking(ContractBreaking breaking) {
        this.breaking = breaking;
    }

    @Override
    public int totalRenewals() {
        return this.counterRenewals;
    }

    @Override
    public void renewal(ContractRenewal renewal) {
        this.counterRenewals++;
        this.renewals.add(renewal);
    }

    @Override
    public void breakContract(ContractBreaking breaking) {
        this.setContractStatusToTerminated();
        this.breaking = breaking;
    }

    public void setContractStatusToTerminated() {
        this.setStatus("TERMINE");
    }
}