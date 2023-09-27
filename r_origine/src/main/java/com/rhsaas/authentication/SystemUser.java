package com.rhsaas.authentication;

import java.util.Date;

import org.mindrot.jbcrypt.BCrypt;

import com.rhsaas.staff.Employee;

public class SystemUser implements BcryptFacade {
    private String systemUserId;
    private String username;
    private String passwordEncrypted;
    private Boolean doubleFactorAuthenticationEnabled = false;
    private int doubleFactorAuthenticationCode;
    private Date lastLoginAt;
    private Boolean systemUserSessionActive = false;
    private Boolean activeStatus = false;
    private Date systemUserCreatedAt;
    private Date systemUserUpdatedAt;
    private String password;
    private Employee employee;

    public SystemUser() {
        //
    }

    public SystemUser(String systemUserId, String username, String passwordEncrypted, Date systemUserCreatedAt, Date systemUserUpdatedAt) {
        this.systemUserId = systemUserId;
        this.username = username;
        this.passwordEncrypted = passwordEncrypted;
        this.systemUserCreatedAt = systemUserCreatedAt;
        this.systemUserUpdatedAt = systemUserUpdatedAt;
    }

    public String getSystemUserId() {
        return systemUserId;
    }

    public void setSystemUserId(String systemUserId) {
        this.systemUserId = systemUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    public Boolean isDoubleFactorAuthenticationEnabled() {
        return doubleFactorAuthenticationEnabled;
    }

    public void setDoubleFactorAuthenticationEnabled(Boolean doubleFactorAuthenticationEnabled) {
        this.doubleFactorAuthenticationEnabled = doubleFactorAuthenticationEnabled;
    }

    public int getDoubleFactorAuthenticationCode() {
        return doubleFactorAuthenticationCode;
    }

    public void setDoubleFactorAuthenticationCode(int doubleFactorAuthenticationCode) {
        this.doubleFactorAuthenticationCode = doubleFactorAuthenticationCode;
    }

    public Date getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(Date lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public Boolean isSystemUserSessionActive() {
        return systemUserSessionActive;
    }

    public void setSystemUserSessionActive(Boolean systemUserSessionActive) {
        this.systemUserSessionActive = systemUserSessionActive;
    }

    public Boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getSystemUserCreatedAt() {
        return systemUserCreatedAt;
    }

    public void setSystemUserCreatedAt(Date systemUserCreatedAt) {
        this.systemUserCreatedAt = systemUserCreatedAt;
    }

    public Date getSystemUserUpdatedAt() {
        return systemUserUpdatedAt;
    }

    public void setSystemUserUpdatedAt(Date systemUserUpdatedAt) {
        this.systemUserUpdatedAt = systemUserUpdatedAt;
    }

    @Override
    public void hashPassword(String plainPassword) {
        this.password = BCrypt.hashpw(plainPassword, BCrypt.gensalt(12));
    }

    @Override
    public boolean verifyPassword(String plainPassword) {
        return BCrypt.checkpw(plainPassword, this.password);
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean login(String enteredPassword) {
        if (verifyPassword(enteredPassword) && isActiveStatus()) {
            setLastLoginAt(new Date());

            setSystemUserSessionActive(true);

            return true;
        }
        return false;
    }

    public void logout() {
        setSystemUserSessionActive(false);
    }
}