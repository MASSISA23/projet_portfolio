package com.rhsaas.staff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.rhsaas.utils.Gender;
import com.rhsaas.utils.MatrimonialStatus;
import com.rhsaas.utils.TypeEmployeeEnum;

public abstract class Personal {
    private String refCode;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private Gender gender;
    private String personalEmail;
    private String professionalEmail;
    private String phone;
    private String phone1;
    private String phone2;
    private String adress;
    private String emergencyEmail;
    private String emergencyPhone;
    private TypeEmployeeEnum typeEmployee;
    private BigDecimal salary;
    private String position;
    private Date hireDate;
    private Date endContractDate;
    private MatrimonialStatus matrimonialStatus;
    private BankAccount bankAccount;
    private ArrayList<Document> documents = new ArrayList<>();

    public Personal() {
        //
    }

    public Personal(
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
        MatrimonialStatus matrimonialStatus
    ) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.personalEmail = personalEmail;
        this.professionalEmail = professionalEmail;
        this.phone = phone;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.adress = adress;
        this.emergencyEmail = emergencyEmail;
        this.emergencyPhone = emergencyPhone;
        this.typeEmployee = typeEmployee;
        this.salary = salary;
        this.position = position;
        this.hireDate = hireDate;
        this.endContractDate = endContractDate;
        this.matrimonialStatus = matrimonialStatus;
    }

    public Personal(
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
        BankAccount bankAccount
    ) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.personalEmail = personalEmail;
        this.professionalEmail = professionalEmail;
        this.phone = phone;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.adress = adress;
        this.emergencyEmail = emergencyEmail;
        this.emergencyPhone = emergencyPhone;
        this.typeEmployee = typeEmployee;
        this.salary = salary;
        this.position = position;
        this.hireDate = hireDate;
        this.endContractDate = endContractDate;
        this.matrimonialStatus = matrimonialStatus;
        this.bankAccount = bankAccount;
    }

    public String getRefCode() {
        return this.refCode;
    }
    
    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPersonalEmail() {
        return this.personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }
    
    public String getProfessionalEmail() {
        return this.professionalEmail;
    }

    public void setProfessionalEmail(String professionalEmail) {
        this.professionalEmail = professionalEmail;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone1() {
        return this.phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return this.phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmergencyPhone() {
        return this.emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyEmail() {
        return this.emergencyEmail;
    }

    public void setEmergencyEmail(String emergencyEmail) {
        this.emergencyEmail = emergencyEmail;
    }

    public TypeEmployeeEnum getTypeEmployee() {
        return this.typeEmployee;
    }

    public void setTypeEmployee(TypeEmployeeEnum typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    } 

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Date hirDate) {
        this.hireDate = hirDate;
    }

    public Date getEndContractDate() {
        return this.endContractDate;
    }

    public void setEndContractDate(Date endContractDate) {
        this.endContractDate = endContractDate;
    }

    public MatrimonialStatus getMatrimonialStatus() {
        return this.matrimonialStatus;
    }

    public void setMatrimonialStatus(MatrimonialStatus matrimonialStatus) {
        this.matrimonialStatus = matrimonialStatus;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public ArrayList<Document> getDocuments() {
        return this.documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public void appendDocument(Document document) {
        this.documents.add(document);
    }

    public void removeDocumentByIndex(int index) {
        this.documents.remove(index);
    }

    public String concatDocumentTitles() {
        return documents.stream()
            .map(Document::getTitle)
            .reduce("", (a, b) -> a + ", " + b)
            .replaceAll("^, ", "");
    }

    @Override
    public String toString() {
        return "Personal Information: \n" +
               "Reference Code: " + refCode + "\n" +
               "Last Name: " + lastName + "\n" +
               "First Name: " + firstName + "\n" +
               "Date of Birth: " + dateOfBirth + "\n" +
               "Gender: " + gender + "\n" +
               "Personal Email: " + personalEmail + "\n" +
               "Professional Email: " + professionalEmail + "\n" +
               "Phone: " + phone + "\n" +
               "Phone 1: " + phone1 + "\n" +
               "Phone 2: " + phone2 + "\n" +
               "Address: " + adress + "\n" +
               "Emergency Email: " + emergencyEmail + "\n" +
               "Emergency Phone: " + emergencyPhone + "\n" +
               "Type of Employee: " + typeEmployee + "\n" +
               "Salary: " + salary + "\n" +
               "Position: " + position + "\n" +
               "Hire Date: " + hireDate + "\n" +
               "End Contract Date: " + endContractDate + "\n" +
               "Matrimonial Status: " + matrimonialStatus + "\n" +
               "Bank Account: " + bankAccount + "\n" +
               "Documents: " + concatDocumentTitles();
    }
}
