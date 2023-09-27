package com.rhsaas.staff;

import java.util.Date;

public class Document {
    private String refCode;
    private String title;
    private String description;
    private Date documentCreatedAt;
    private String uri;

    public Document(String refCode, String title, String description, Date documentCreatedAt, String uri) {
        this.refCode = refCode;
        this.title = title;
        this.description = description;
        this.documentCreatedAt = documentCreatedAt;
        this.uri = uri;
    }

    public String getRefCode() {
        return this.refCode;
    }
    
    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDocumentCreatedAt() {
        return this.documentCreatedAt;
    }

    public void setDocumentCreatedAt(Date documentCreatedAt) {
        this.documentCreatedAt = documentCreatedAt;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Document Information: \n" +
               "Reference Code: " + refCode + "\n" +
               "Title: " + title + "\n" +
               "Description: " + description + "\n" +
               "Date d'enregistrement: " + documentCreatedAt + "\n" +
               "Lien vers le fichier: " + uri + "\n";

    }
}
