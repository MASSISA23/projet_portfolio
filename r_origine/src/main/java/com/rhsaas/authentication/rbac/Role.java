package com.rhsaas.authentication.rbac;

import java.util.ArrayList;
import java.util.Date;

import com.rhsaas.authentication.SystemUser;

public class Role {
    private Long refCode;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    private ArrayList<Permission> permissions = new ArrayList<>();
    private ArrayList<SystemUser> users = new ArrayList<>();

    // Constructors
    public Role() {
        // Default constructor
    }

    public Role(Long refCode, String name, String description, Date createdAt, Date updatedAt) {
        this.refCode = refCode;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getter and Setter methods
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ArrayList<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<Permission> permissions) {
        this.permissions = permissions;
    }

    public ArrayList<SystemUser> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<SystemUser> users) {
        this.users = users;
    }


    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public void addAllPermission(ArrayList<Permission> permissions) {
        permissions.addAll(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Role Information:\n");
        sb.append("Reference Code: ").append(refCode).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Description: ").append(description).append("\n");
        sb.append("Created At: ").append(createdAt).append("\n");
        sb.append("Updated At: ").append(updatedAt).append("\n");
        sb.append("Permissions:\n");
        for (Permission permission : permissions) {
            sb.append(permission.toString()).append("\n");
        }
        sb.append("Users:\n");
        for (SystemUser user : users) {
            sb.append(user.toString()).append("\n");
        }
        return sb.toString();
    }
}
