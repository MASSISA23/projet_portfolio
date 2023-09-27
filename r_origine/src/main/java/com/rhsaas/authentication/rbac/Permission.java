package com.rhsaas.authentication.rbac;

import java.util.ArrayList;

public class Permission {
    private Long refCode;
    private String name;
    private String description;
    private ArrayList<Role> roles = new ArrayList<>();

    public Permission() {
        //
    }

    public Permission(Long refCode, String name, String description) {
        this.refCode = refCode;
        this.name = name;
        this.description = description;
    }

    public Long getRefCode() {
        return refCode;
    }

    public void setRefCode(Long refCode) {
        this.refCode = refCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "refCode=" + refCode +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}