package com.rhsaas.staff;

public class Responsability {
    private Long refCode;
    private String title;
    private String description;
    private Position position;

    public Responsability() {
        //
    }

    public Responsability(Long refCode, String title, String description, Position position) {
        this.refCode = refCode;
        this.title = title;
        this.description = description;
        this.position = position;
    }

    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}