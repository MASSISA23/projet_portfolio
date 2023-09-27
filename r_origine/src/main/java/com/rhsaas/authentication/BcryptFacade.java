package com.rhsaas.authentication;

public interface BcryptFacade {
    static final int SALT = 12;

    void hashPassword(String plainPassword);
    boolean verifyPassword(String plainPassword);
}