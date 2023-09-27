package com.rhsaas.contracts;

public interface ContractBreakingInterface {
    abstract void setContractStatusToTerminated();
    abstract void breakContract(ContractBreaking breaking);
}
