package com.rhsaas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import com.rhsaas.authentication.rbac.Permission;
import com.rhsaas.authentication.rbac.Role;
import com.rhsaas.contracts.FixedTermContract;
import com.rhsaas.staff.BankAccount;
import com.rhsaas.staff.Employee;
import com.rhsaas.utils.Gender;
import com.rhsaas.utils.MatrimonialStatus;
import com.rhsaas.utils.TypeEmployeeEnum;
import com.rhsaas.departments.Departement;
import com.rhsaas.insurance.InsurancePolicy;
import com.rhsaas.insurance.Beneficiary;
import com.rhsaas.utils.TrainingType;
import com.rhsaas.staff.Position;
import com.rhsaas.staff.Trainee;

public class Main {
    
    public static Long generateRandomInteger() {
        Random random = new Random();
        Long randomNumber = random.nextLong(9000) + 1000;
        return randomNumber;
    }

    public static Date createDate(int year, int month, int day) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        System.out.println("R ORIGINE");
        System.out.println(generateRandomInteger());

        Role superAdminRole = new Role(
            generateRandomInteger(),
            "Super Admin",
            "Manage all ERP",
            new Date(),
            new Date()
        );
        Role ceoRole = new Role(
            generateRandomInteger(),
            "Super Admin",
            "Manage all ERP",
            new Date(),
            new Date()
        );
        Role humanResourcesManagerRole = new Role(
            generateRandomInteger(),
            "Human Resources Director",
            "Manage all resources for HR",
            new Date(),
            new Date()
        );

        Permission createUser = new Permission(
            generateRandomInteger(),
            "users.create",
            "Create user"
        );
        Permission showUser = new Permission(
            generateRandomInteger(),
            "users.show",
            "Show user"
        );
        Permission updateUser = new Permission(
            generateRandomInteger(),
            "users.update",
            "Update user"
        );
        Permission deleteUser = new Permission(
            generateRandomInteger(),
            "users.delete",
            "Delete user"
        );

        Permission createEmployee = new Permission(
            generateRandomInteger(),
            "employees.create",
            "Create employee"
        );
        Permission showEmployee = new Permission(
            generateRandomInteger(),
            "employees.show",
            "Show employee"
        );
        Permission updateEmployee = new Permission(
            generateRandomInteger(),
            "employees.update",
            "Update employee"
        );
        Permission deleteEmployee = new Permission(
            generateRandomInteger(),
            "employees.delete",
            "Delete employee"
        );

        Permission createTrainee = new Permission(
            generateRandomInteger(),
            "trainees.create",
            "Create trainee"
        );
        Permission showTrainee = new Permission(
            generateRandomInteger(),
            "trainees.show",
            "Show trainee"
        );
        Permission updateTrainee = new Permission(
            generateRandomInteger(),
            "trainees.update",
            "Update trainee"
        );
        Permission deleteTrainee = new Permission(
            generateRandomInteger(),
            "trainees.delete",
            "Delete trainee"
        );

        Permission createContract = new Permission(
            generateRandomInteger(),
            "contracts.create",
            "Create contract"
        );
        Permission showContract = new Permission(
            generateRandomInteger(),
            "contracts.show",
            "Show contract"
        );
        Permission updateContract = new Permission(
            generateRandomInteger(),
            "contracts.update",
            "Update contract"
        );
        Permission deleteContract = new Permission(
            generateRandomInteger(),
            "contracts.delete",
            "Delete contract"
        );
        Permission renewalContract = new Permission(
            generateRandomInteger(),
            "contracts.renewal",
            "Renewal contract"
        );
        Permission breakingContract = new Permission(
            generateRandomInteger(),
            "contracts.breaking",
            "Breaking contract"
        );

        Permission createRecruitment = new Permission(
            generateRandomInteger(),
            "recruitments.create",
            "Create recruitment"
        );
        Permission showRecruitment = new Permission(
            generateRandomInteger(),
            "recruitments.show",
            "Show recruitment"
        );
        Permission updateRecruitment = new Permission(
            generateRandomInteger(),
            "recruitments.update",
            "Update recruitment"
        );
        Permission deleteRecruitment = new Permission(
            generateRandomInteger(),
            "recruitments.delete",
            "Delete recruitment"
        );

        ArrayList<Permission> userResourcePermissions = new ArrayList<>(
            Arrays.asList(createUser, showUser, updateUser, deleteUser)
        );

        ArrayList<Permission> employeeResourcePermissions = new ArrayList<>(
            Arrays.asList(createEmployee, showEmployee, updateEmployee, deleteEmployee)
        );

        ArrayList<Permission> traineeResourcePermissions = new ArrayList<>(
            Arrays.asList(createTrainee, showTrainee, updateTrainee, deleteTrainee)
        );

        ArrayList<Permission> contractResourcePermissions = new ArrayList<>(
            Arrays.asList(createContract, showContract, updateContract, deleteContract, renewalContract, breakingContract)
        );

        ArrayList<Permission> recruitmentResourcePermissions = new ArrayList<>(
            Arrays.asList(createRecruitment, showRecruitment, updateRecruitment, deleteRecruitment)
        );

        humanResourcesManagerRole.addAllPermission(contractResourcePermissions);
        humanResourcesManagerRole.addAllPermission(employeeResourcePermissions);
        humanResourcesManagerRole.addAllPermission(traineeResourcePermissions);
        humanResourcesManagerRole.addAllPermission(recruitmentResourcePermissions);

        superAdminRole.addAllPermission(userResourcePermissions);
        superAdminRole.addAllPermission(employeeResourcePermissions);
        superAdminRole.addAllPermission(traineeResourcePermissions);
        superAdminRole.addAllPermission(contractResourcePermissions);

        ceoRole.addAllPermission(humanResourcesManagerRole.getPermissions());

        System.out.println(superAdminRole);

        Employee employee1 = new Employee(
            "E001",
            "Doe",
            "John",
            createDate(1980, 1, 15),
            Gender.HOMME,
            "john.doe@example.com",
            "john.doe@company.com",
            "123-456-7890",
            "987-654-3210",
            null,
            "123 Main St",
            "emergency@example.com",
            "987-123-4567",
            TypeEmployeeEnum.CADRE_SUPERIEUR,
            new BigDecimal("50000.00"),
            "Software Engineer",
            createDate(2023, 1, 1),
            createDate(2024, 12, 31),
            MatrimonialStatus.MARIE,
            new BankAccount(generateRandomInteger(), "513090008550", "BOA"),
            "Active",
            "12345",
            "EMP001",
            null,
            "Software Engineer"
        );
        
        Employee employee2 = new Employee(
            "E002",
            "Doe",
            "Jane",
            createDate(1985, 4, 25),
            Gender.FEMME,
            "jane.doe@example.com",
            "jane.doe@company.com",
            "987-654-3210",
            "123-456-7890",
            null,
            "123 Main St",
            "emergency@example.com",
            "987-123-4567",
            TypeEmployeeEnum.CADRE_SUPERIEUR,
            new BigDecimal("50000.00"),
            "Software Engineer",
            createDate(2023, 1, 1),
            createDate(2024, 12, 31),
            MatrimonialStatus.MARIE,
            new BankAccount(generateRandomInteger(), "513090008550", "BOA"),
            "Active",
            "12345",
            "EMP002",
            null,
            "Software Engineer"
        );

        Employee employee3 = new Employee(
            "E003",
            "Smith",
            "Alice",
            createDate(1992, 9, 10),
            Gender.FEMME,
            "alice.smith@example.com",
            "alice.smith@company.com",
            "987-654-3210",
            "123-456-7890",
            null,
            "456 Elm St",
            "emergency@example.com",
            "987-123-4567",
            TypeEmployeeEnum.CADRE_SUPERIEUR,
            new BigDecimal("55000.00"),
            "Product Manager",
            createDate(2023, 1, 1),
            createDate(2024, 12, 31),
            MatrimonialStatus.CELIBATAIRE,
            new BankAccount(generateRandomInteger(), "513090008551", "BOA"),
            "Active",
            "23456",
            "EMP003",
            null,
            "Product Manager"
        );

        Employee employee4 = new Employee(
            "E004",
            "Johnson",
            "Michael",
            createDate(1988, 7, 3),
            Gender.HOMME,
            "michael.johnson@example.com",
            "michael.johnson@company.com",
            "987-654-3210",
            "123-456-7890",
            null,
            "789 Oak St",
            "emergency@example.com",
            "987-123-4567",
            TypeEmployeeEnum.CADRE_SUPERIEUR,
            new BigDecimal("52000.00"),
            "Quality Assurance Analyst",
            createDate(2023, 1, 1),
            createDate(2024, 12, 31),
            MatrimonialStatus.MARIE,
            new BankAccount(generateRandomInteger(), "513090008552", "BOA"),
            "Active",
            "34567",
            "EMP004",
            null,
            "Quality Assurance Analyst"
        );

        Employee employee5 = new Employee(
            "E005",
            "Brown",
            "David",
            createDate(1990, 3, 20),
            Gender.HOMME,
            "david.brown@example.com",
            "david.brown@company.com",
            "987-654-3210",
            "123-456-7890",
            null,
            "567 Maple St",
            "emergency@example.com",
            "987-123-4567",
            TypeEmployeeEnum.CADRE_SUPERIEUR,
            new BigDecimal("48000.00"),
            "Graphic Designer",
            createDate(2023, 1, 1),
            createDate(2024, 12, 31),
            MatrimonialStatus.CELIBATAIRE,
            new BankAccount(generateRandomInteger(), "513090008553", "BOA"),
            "Active",
            "45678",
            "EMP005",
            null,
            "Graphic Designer"
        );

        Departement informatiqueDepartment = new Departement(
            String.valueOf(generateRandomInteger()),
            "Informatique",
            "Département informatique",
            null
        );
        Departement financeDepartment = new Departement(
            String.valueOf(generateRandomInteger()),
            "Finance",
            "Département finance",
            null
        );
        Departement operationsDepartment = new Departement(
            String.valueOf(generateRandomInteger()),
            "Opérationnel",
            "Département opérationnel",
            null
        );
        Departement dgDepartment = new Departement(
            String.valueOf(generateRandomInteger()),
            "Direction Général",
            "Département exécutif",
            null
        );

        operationsDepartment.setManager(employee3);
        financeDepartment.setManager(employee2);
        informatiqueDepartment.setManager(employee1);
        dgDepartment.setManager(employee1);

        FixedTermContract johnFixedTermContract = new FixedTermContract(
            generateRandomInteger(),
            createDate(2023, 12, 12),
            null,
            "Active",
            "Software Engineer",
            createDate(2024, 12, 12),
            null,
            null,
            0,
            new BigDecimal("800000.00"),
            null,
            0.18,
            0,
            employee1
        );

        InsurancePolicy policy1 = new InsurancePolicy(
            "POL001",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            new Date(),
            new Date(),
            new BigDecimal("500.00"),
            "Life Insurance",
            new BigDecimal("1000000.00"),
            new BigDecimal("1000.00"),
            "Active",
            "ABC Insurance",
            "contact@abcinsurance.com",
            "Terms and conditions...",
            new Date(),
            true,
            null
        );

        InsurancePolicy policy2 = new InsurancePolicy(
            "POL002",
            "Jane Smith",
            "456 Elm St",
            "jane.smith@example.com",
            new Date(),
            new Date(),
            new BigDecimal("800.00"),
            "Auto Insurance",
            new BigDecimal("30000.00"),
            new BigDecimal("500.00"),
            "Active",
            "AssuranceSanté",
            "contact@xyzinsurance.com",
            "Terms and conditions...",
            new Date(),
            true,
            null
        );

        InsurancePolicy policy3 = new InsurancePolicy(
            "POL003",
            "Michael Johnson",
            "789 Oak St",
            "michael.j@example.com",
            new Date(),
            new Date(),
            new BigDecimal("600.00"),
            "Health Insurance",
            new BigDecimal("500000.00"),
            new BigDecimal("2000.00"),
            "Active",
            "HealthCare Inc.",
            "contact@healthcareinc.com",
            "Terms and conditions...",
            new Date(),
            true,
            null
        );

        policy2.setPersonal(employee1);

        Trainee trainee1 = new Trainee(
            "REF001",
            "Doe",
            "John",
            createDate(1990, 5, 15),
            Gender.NON_BINAIRE,
            "john.doe@gmail.com",
            "john.doe@company.com",
            "123456789",
            "987654321",
            "",
            "123 Main St",
            "emergency.email@example.com",
            "987654321",
            TypeEmployeeEnum.STAGIAIRE,
            BigDecimal.valueOf(1000),
            "Trainee",
            createDate(2023, 9, 15),
            createDate(2024, 9, 15),
            MatrimonialStatus.CELIBATAIRE,
            new BankAccount(
                generateRandomInteger(),
                "513090008550",
                "CODE SWIFT/BIC COBBBJBJ",
                "BJ0670151351309000855012",
                "BOA",
                "Paris C/40"
            ),
            BigDecimal.valueOf(500),
            TrainingType.PROFESSIONNEL,
            "Trainee",
            createDate(2023, 9, 1),
            createDate(2023, 12, 31)
        );

        Employee manager1 = employee1;
        Employee manager2 = employee2;

        Departement department1 = new Departement(
            "D001",
            "Engineering",
            "Engineering Department",
            manager1
        );
        Departement department2 = new Departement(
            "D002",
            "Marketing",
            "Marketing Department",
            manager2
        );

        trainee1.setDepartement(department1);
        employee1.setDepartement(department1);
        employee2.setDepartement(department2);

        Position position = new Position(
            generateRandomInteger(),
            "Development and Innovation Manager",
            null,
            createDate(2022, 12, 29),
            employee1,
            department1,
            "Senior Advanced",
            null,
            null,
            10,
            manager1,
            true,
            null
        );

        employee1.setEmployeePosition(position);

        Beneficiary wife = new Beneficiary(
            generateRandomInteger(),
            "Marie Doe",
            "123 Main St"
        );
        Beneficiary child1 = new Beneficiary(
            generateRandomInteger(),
            "Lucas Doe",
            "456 Elm St"
        );
        Beneficiary child2 = new Beneficiary(
            generateRandomInteger(),
            "Sophia Doe",
            "789 Oak St"
        );

        ArrayList<Beneficiary> beneficaries = new ArrayList<>(Arrays.asList(wife, child1, child2));

        policy2.setBeneficiaries(beneficaries);

        employee1.setContrat(johnFixedTermContract);
        
        System.out.println(employee1);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(policy1);
        System.out.println(policy3);
        System.out.println(employee1.getContrat());
    }
}