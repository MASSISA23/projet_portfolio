Projet de Gestion de la Resource Humaine (RH)

### Introduction
Le projet de Gestion de la Resource Humaine (RH) est une application console textuelle conçue dans le cadre d'un projet académique. L'objectif est de simplifier la gestion efficace des ressources humaines au sein d'une entreprise simulée en utilisant les compétences acquises en Java et en Maven.

### Fonctionnalités Principales

#### 1. Gestion de l'authentification à l'ERP
- Création de profils d'employés complets avec des informations personnelles.
- Inclusion de détails de contact, compétences et dossiers de performance.

#### 2. RBAC de l'ERP
- Mise en place d'un contrôle d'accès basé sur les rôles (RBAC).
- Gestion des autorisations et des restrictions d'accès pour les profils d'employés.

#### 3. Gestion des Employés
- Création et gestion complète des profils d'employés.
- Inclusion d'informations personnelles, détails de contact, compétences et dossiers de performance.

#### 4. Calendrier de Congés et de Présence
- Suivi centralisé des congés, jours de congé maladie et présences.
- Planification efficace des ressources humaines en fonction des absences.

#### 5. Gestion des Horaires
- Création et gestion des horaires de travail des employés.
- Adaptation des horaires en fonction des besoins de l'entreprise simulée.

#### 6. Suivi des Key Performances Indicator (KPI)
- Évaluation des performances des employés.
- Suivi des objectifs, réalisations et identification des opportunités d'amélioration.

#### 7. Gestion des Départements
- Évaluation des performances des employés par département.
- Suivi des objectifs, réalisations et identification des opportunités d'amélioration.

#### 8. Gestion des fiches de paies
- Calcul et gestion des fiches de paies des employés.
- Suivi des rémunérations en fonction des performances et des accords contractuels.

#### 9. Gestion des recrutements
- Processus complet de gestion des recrutements.
- Suivi des candidatures, entretiens et intégration des nouveaux employés.

#### 10. Gestion des contrats
- Création et suivi des contrats d'emploi.
- Gestion des termes contractuels et des échéances.

### Structure du projet

Le projet est organisé de la manière suivante :

- `src/main/java` : Contient les fichiers source Java du projet.
  - `com.rhsaas.authentication` : Package principal contenant les classes pour l'authentification.
  - `com.rhsaas.contracts` : Package contenant les classes pour la gestion des contrats
  - `com.rhsaas.departments` : Package contenant la classe Department
  - `com.rhsaas.insurance` : Package contenant les classes et interfaces, et abstractions pour la gestion des assurances
  - `com.rhsaas.recruitment` : Package contenant les classes et interfaces, et abstractions pour la gestion des recrutements
  - `com.rhsaas.staff` : Package contenant les classes pour la gestion des employés, des postes de travail, de suivi des horaires, des présences, des heures supplémentaires, des salaires, ainsi que des KPI / employé / poste
  - `com.rhsaas.Main.java` : Classe statique principale d'ouverture de l'application
  - `com.rhsaas.utils` : Package contenant les classes, énumérations, et facades utilisées dans le projet
- `resources/` : Contient les fichiers de configuration et de données nécessaires.
- `tests/` : Contient les tests unitaires pour les différentes fonctionnalités.
- `target/` : Contient les tests unitaires pour les différentes fonctionnalités.
  - `pom.xml` : Fichier de description des dependencies maven


### Exemple de quelquess classes métiers et implémentations

/**
 * La classe Employee représente un employé dans le système de gestion des ressources humaines.
 * Elle étend la classe abstract Personal et contient des informations spécifiques à un employé, telles que son statut,
 * son numéro de badge, son numéro d'identification, son responsable, son titre de poste, etc.
 */
public class Employee extends Personal {

    // ...

    /**
     * Constructeur par défaut de la classe Employee.
     * Crée une instance d'employé avec des valeurs par défaut.
     */
    public Employee() {
        // ...
    }

    /**
     * Constructeur de la classe Employee avec des paramètres.
     * @param refCode Le code de référence de l'employé.
     * @param lastName Le nom de famille de l'employé.
     * @param firstName Le prénom de l'employé.
     * @param dateOfBirth La date de naissance de l'employé.
     * @param gender Le genre de l'employé.
     * @param personalEmail L'adresse e-mail personnelle de l'employé.
     * @param professionalEmail L'adresse e-mail professionnelle de l'employé.
     * @param phone Le numéro de téléphone principal de l'employé.
     * @param phone1 Un numéro de téléphone supplémentaire de l'employé.
     * @param phone2 Un autre numéro de téléphone supplémentaire de l'employé.
     * @param address L'adresse de l'employé.
     * @param emergencyEmail L'adresse e-mail d'urgence de l'employé.
     * @param emergencyPhone Le numéro de téléphone d'urgence de l'employé.
     * @param typeEmployee Le type d'employé (par exemple, temps plein, temps partiel).
     * @param salary Le salaire de l'employé.
     * @param position Le poste de l'employé.
     * @param hireDate La date d'embauche de l'employé.
     * @param endContractDate La date de fin de contrat de l'employé.
     * @param matrimonialStatus L'état matrimonial de l'employé.
     * @param badgeId Le numéro de badge de l'employé.
     * @param numberId Le numéro d'identification de l'employé.
     * @param manager Le responsable de l'employé.
     * @param jobTitle Le titre de poste de l'employé.
     */
    public Employee(
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
        String badgeId,
        String numberId,
        Employee manager,
        String jobTitle
    ) {
        // ...
    }

    // Méthodes, getters et setters...

    // ...

}

Employee employee = new Employee(
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


/**
 * La classe Personal représente les informations personnelles d'un employé.
 * Cette classe est abstraite et contient des attributs communs à tous les types d'employés.
 */
public abstract class Personal {

    // ...

    /**
     * Constructeur par défaut de la classe Personal.
     * Crée une instance de données personnelles avec des valeurs par défaut.
     */
    public Personal() {
        // ...
    }

    /**
     * Constructeur de la classe Personal avec des paramètres de base.
     * @param refCode Le code de référence des données personnelles.
     * @param lastName Le nom de famille de l'employé.
     * @param firstName Le prénom de l'employé.
     * @param dateOfBirth La date de naissance de l'employé.
     * @param gender Le genre de l'employé.
     * @param personalEmail L'adresse e-mail personnelle de l'employé.
     * @param professionalEmail L'adresse e-mail professionnelle de l'employé.
     * @param phone Le numéro de téléphone principal de l'employé.
     * @param phone1 Un numéro de téléphone supplémentaire de l'employé.
     * @param phone2 Un autre numéro de téléphone supplémentaire de l'employé.
     * @param address L'adresse de l'employé.
     * @param emergencyEmail L'adresse e-mail d'urgence de l'employé.
     * @param emergencyPhone Le numéro de téléphone d'urgence de l'employé.
     * @param typeEmployee Le type d'employé (par exemple, temps plein, temps partiel).
     * @param salary Le salaire de l'employé.
     * @param position Le poste de l'employé.
     * @param hireDate La date d'embauche de l'employé.
     * @param endContractDate La date de fin de contrat de l'employé.
     * @param matrimonialStatus L'état matrimonial de l'employé.
     */
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
        String address,
        String emergencyEmail,
        String emergencyPhone,
        TypeEmployeeEnum typeEmployee,
        BigDecimal salary,
        String position,
        Date hireDate,
        Date endContractDate,
        MatrimonialStatus matrimonialStatus
    ) {
        // ...
    }

    // Méthodes, getters et setters...

    // ...

}

### Installation

Avant d'installer l'application, assurez-vous d'avoir les versions suivantes installées :
- Java version : 20.0.2
- Apache Maven : 3.9.4
- JDK (Java Development Kit)
- JRE (Java Runtime Environment)

**Étapes d'Installation:**
1. Accédez au répertoire du projet où se trouve le fichier pom.xml.
2. Compilez et construisez le projet avec Maven : `mvn clean install` puis `mvn compile`.
3. Configurez les paramètres de l'application en éditant le fichier `config.properties`.
4. Exécutez l'application : `mvn java:exec`.

La commande `mvn clean install` assure le téléchargement des dépendances nécessaires et la compilation réussie du projet en utilisant la version de Java spécifiée.

### Exécution

Dans le fichier `Main.java`, plusieurs instances des classes utilisées dans le système ont été créées pour simuler leur fonctionnement, en se basant sur l'énoncé du TP. Tous les autres packages peuvent être utilisés à la discrétion de l'étudiant, qui peut instancier leurs classes et simuler également leurs fonctionnements et logiques business.

### Utilisation de l'application

Cette application console textuelle peut être utilisée en instanciant les classes, en comprenant la structure entre elles et de pourvoir simuler le comportement réel d'un logiciel ERP de gestion de la ressource humaine dans son intégralité.
Le point d'entrée est la classe Main.java ou plusieurs scénarios ont été écrits


