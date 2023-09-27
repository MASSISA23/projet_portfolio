package com.rhsaas.staff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rhsaas.authentication.SystemUser;
import com.rhsaas.contracts.Contract;
import com.rhsaas.departments.Departement;
import com.rhsaas.utils.Gender;
import com.rhsaas.utils.MatrimonialStatus;
import com.rhsaas.utils.TypeEmployeeEnum;

public class Employee extends Personal {
    private String status;
    private String badgeId;
    private String numberId;
    private Employee manager;
    private String jobTitle;
    private SystemUser accessAccount;
    Contract contract;
    Position position;

    private int socialNumber;
    private double hourlyRate;
    private Departement departement;
    private List<OvertimeHours> overtimesList=new ArrayList<>();
    private List<Attendance> attendanceList=new ArrayList<>();
    private List<Mission> assignedMissions=new ArrayList<>();
    private List<Holidays> holidaysList;

    private static int employeeCount;
    private static final String COMPANY_NAME = "RHSAAS";

    public Employee() {
        
    }

    public Employee
    (
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
        String address,
        String emergencyEmail,
        String emergencyPhone,
        TypeEmployeeEnum typeEmployee,
        BigDecimal salary,
        String position,
        Date hireDate,
        Date endContractDate,
        MatrimonialStatus matrimonialStatus,
        BankAccount bankAccount,
        String status,
        String badgeId,
        String numberId,
        Employee manager,
        String jobTitle
    ) {
        super(refCode, lastName, firstName, dateOfBirth, gender, personalEmail, professionalEmail, phone, phone1, phone2, address, emergencyEmail, emergencyPhone, typeEmployee, salary, position, hireDate, endContractDate, matrimonialStatus, bankAccount);
        this.status = status;
        this.badgeId = badgeId;
        this.numberId = numberId;
        this.manager = manager;
        this.jobTitle = jobTitle;

        employeeCount++;
    }

    public Employee
    (
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
        String address,
        String emergencyEmail,
        String emergencyPhone,
        TypeEmployeeEnum typeEmployee,
        BigDecimal salary,
        String position,
        Date hireDate,
        Date endContractDate,
        MatrimonialStatus matrimonialStatus,
        String status,
        String badgeId,
        String numberId,
        Employee manager,
        String jobTitle,
        Contract contract
    ) {
        super(refCode, lastName, firstName, dateOfBirth, gender, personalEmail, professionalEmail, phone, phone1, phone2, address, emergencyEmail, emergencyPhone, typeEmployee, salary, position, hireDate, endContractDate, matrimonialStatus);
        this.status = status;
        this.badgeId = badgeId;
        this.numberId = numberId;
        this.manager = manager;
        this.jobTitle = jobTitle;
        this.contract = contract;

        employeeCount++;
    }

    public Position getEmployeePosition() {
        return position;
    }

    public void setEmployeePosition(Position position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static String getCompanyName() {
        return COMPANY_NAME;
    }

    public SystemUser getAccessAccount() {
        return this.accessAccount;
    }

    public void setAccessAcount(SystemUser accessAccount) {
        this.accessAccount = accessAccount;
    }

    public Contract getContrat() {
        return this.contract;
    }

    public void setContrat(Contract contract) {
        this.contract = contract;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public int getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(int socialNumber) {
        this.socialNumber = socialNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void addOvertime(OvertimeHours heureSup) {
        overtimesList.add(heureSup);
    }

    public List<OvertimeHours> getOvertime() {
        return overtimesList;
    }

    public double overtimeTotalAmountByDate(Date startDate, Date endDate) {
        double overtimeTotalAmount = 0;

        for (OvertimeHours overtime : overtimesList) {
            Date overtimeDate = overtime.getDate();

            if (!overtimeDate.before(startDate) && !overtimeDate.after(endDate)) {
                overtimeTotalAmount += overtime.overtimeAmount();
            }
        }

        return overtimeTotalAmount;
    }

    public double overtimeTotalAmount() {
        int overtimetotalAmount = 0;

        for (OvertimeHours overtime : overtimesList) {
            overtimetotalAmount+=overtime.overtimeAmount();
        }

        return overtimetotalAmount;
    }

    public void addAttendance(Attendance attendance) {
        attendanceList.add(attendance);
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void takeHoliday(Holidays holiday) {
        holidaysList.add(holiday);
        holiday.setEmployee(this);
    }

    public List<Mission> getAssignedMissions() {
        return assignedMissions;
    }

    public void assignToMission(Mission mission) {
        assignedMissions.add(mission);
    }

    public long totalAttendance(Date startDate, Date endDate) {
        long totalAttendance = 0;

        for (Attendance attendance : attendanceList) {
            Date date = attendance.getDate();
            if (!date.before(startDate) && !date.after(endDate)) {
                totalAttendance += attendance.getWorkinghours();
            }
        }

        return totalAttendance;

    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder();
        
        if (getFirstName() != null) {
            fullNameBuilder.append(getFirstName());
        }
        
        if (getLastName() != null) {
            if (fullNameBuilder.length() > 0) {
                fullNameBuilder.append(" ");
            }
            fullNameBuilder.append(getLastName());
        }
        
        return fullNameBuilder.toString();
    }    

    @Override
    public String toString() {
        return "Employee{" +
                "refCode='" + getRefCode() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender=" + getGender() +
                ", personalEmail='" + getPersonalEmail() + '\'' +
                ", professionalEmail='" + getProfessionalEmail() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", phone1='" + getPhone1() + '\'' +
                ", phone2='" + getPhone2() + '\'' +
                ", address='" + getAdress() + '\'' +
                ", emergencyEmail='" + getEmergencyEmail() + '\'' +
                ", emergencyPhone='" + getEmergencyPhone() + '\'' +
                ", typeEmployee=" + getTypeEmployee() +
                ", salary=" + getSalary() +
                ", position='" + getPosition() + '\'' +
                ", hireDate=" + getHireDate() +
                ", endContractDate=" + getEndContractDate() +
                ", matrimonialStatus=" + getMatrimonialStatus() +
                ", status='" + status + '\'' +
                ", badgeId='" + badgeId + '\'' +
                ", numberId='" + numberId + '\'' +
                ", manager=" + (manager != null ? manager.getFullName() : "null") +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

}
