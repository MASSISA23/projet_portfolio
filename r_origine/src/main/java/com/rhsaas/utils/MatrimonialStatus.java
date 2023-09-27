package com.rhsaas.utils;

public enum MatrimonialStatus {
    CELIBATAIRE("Célibataire"),
    MARIE("Marié(e)"),
    PACSE("Pacsé(e)"),
    SEPARE("Séparé(e)"),
    DIVORCE("Divorcé(e)"),
    VEUF("Veuf/Veuve"),
    CONCUBINAGE("En concubinage"),
    MARIAGE_RELIGIEUX("Mariage religieux uniquement"),
    PARTENARIAT_ENREGISTRE("Partenariat enregistré"),
    POLYAMOUR("Polyamour");

    private String libelle;

    MatrimonialStatus(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}