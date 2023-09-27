package com.rhsaas.staff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Certification {
    private Long certificationId;
    private String certificationName;
    private String certifyingAuthority;
    private Date certificationDate;
    private Date expirationDate;
    private String description;
    private String certificationType;
    private List<Skill> associatedSkills = new ArrayList<>();
    private String certificationLevel;
    private String certificationUrl;
    private boolean isValid;
    private Position position;

    public Certification() {
        
    }

    public Certification(Long certificationId, String certificationName, String certifyingAuthority, Date certificationDate, Date expirationDate,
            String description, String certificationType, List<Skill> associatedSkills, String certificationLevel,
            String certificationUrl, boolean isValid, Position position) {
        this.certificationId = certificationId;
        this.certificationName = certificationName;
        this.certifyingAuthority = certifyingAuthority;
        this.certificationDate = certificationDate;
        this.expirationDate = expirationDate;
        this.description = description;
        this.certificationType = certificationType;
        this.associatedSkills = associatedSkills;
        this.certificationLevel = certificationLevel;
        this.certificationUrl = certificationUrl;
        this.isValid = isValid;
        this.position = position;
    }

    // Getter and Setter methods
    public Long getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(Long certificationId) {
        this.certificationId = certificationId;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public String getCertifyingAuthority() {
        return certifyingAuthority;
    }

    public void setCertifyingAuthority(String certifyingAuthority) {
        this.certifyingAuthority = certifyingAuthority;
    }

    public Date getCertificationDate() {
        return certificationDate;
    }

    public void setCertificationDate(Date certificationDate) {
        this.certificationDate = certificationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCertificationType() {
        return certificationType;
    }

    public void setCertificationType(String certificationType) {
        this.certificationType = certificationType;
    }

    public List<Skill> getAssociatedSkills() {
        return associatedSkills;
    }

    public void setAssociatedSkills(List<Skill> associatedSkills) {
        this.associatedSkills = associatedSkills;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public String getCertificationUrl() {
        return certificationUrl;
    }

    public void setCertificationUrl(String certificationUrl) {
        this.certificationUrl = certificationUrl;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}