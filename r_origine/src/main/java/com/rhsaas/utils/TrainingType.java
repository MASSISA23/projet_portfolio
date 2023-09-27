package com.rhsaas.utils;

public enum TrainingType {
    OBSERVATION("Stage d'observation"),
    ACADEMIQUE("Stage académique"),
    PROFESSIONNEL("Stage professionnel"),
    REMUNERE("Stage rémunéré"),
    NON_REMUNERE("Stage non rémunéré"),
    TEMPS_PARTIEL("Stage à temps partiel"),
    TEMPS_PLEIN("Stage à temps plein"),
    ALTERNANCE("Stage en alternance"),
    INTERNATIONAL("Stage international"),
    RECHERCHE("Stage de recherche"),
    ENTREPRISE("Stage en entreprise"),
    SOCIAL("Stage social ou humanitaire");

    private String libelle;

    TrainingType(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
