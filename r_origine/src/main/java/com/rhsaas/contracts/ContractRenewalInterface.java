package com.rhsaas.contracts;

public interface ContractRenewalInterface {
    abstract int totalRenewals();
    abstract void renewal(ContractRenewal renewal);
}