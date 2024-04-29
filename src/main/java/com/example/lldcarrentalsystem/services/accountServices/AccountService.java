package com.example.lldcarrentalsystem.services.accountServices;

import com.example.lldcarrentalsystem.exceptions.AccountDoesNotExistsException;
import com.example.lldcarrentalsystem.entities.userEntities.Account;
import com.example.lldcarrentalsystem.entities.userEntities.AccountType;

public interface AccountService {
    Account createAccount(Account account, AccountType accountType);
    void resetPassword(String userId, String password, AccountType accountType)
            throws AccountDoesNotExistsException;
}