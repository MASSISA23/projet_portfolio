package com.rhsaas.staff;

public class Skill {
    private Long refCode;
    private String title;
    private String description;
    private String masteryLevel;
    private String contextOfUse;
    private Position position;

    // Constructors
    public Skill() {
        // Default constructor
    }

    public Skill(Long refCode, String title, String description, String masteryLevel, String contextOfUse, Position position) {
        this.refCode = refCode;
        this.title = title;
        this.description = description;
        this.masteryLevel = masteryLevel;
        this.contextOfUse = contextOfUse;
        this.position = position;
    }

    // Getter and Setter methods
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

    public String getMasteryLevel() {
        return masteryLevel;
    }

    public void setMasteryLevel(String masteryLevel) {
        this.masteryLevel = masteryLevel;
    }

    public String getContextOfUse() {
        return contextOfUse;
    }

    public void setContextOfUse(String contextOfUse) {
        this.contextOfUse = contextOfUse;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}