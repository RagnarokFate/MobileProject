package com.myapp.Local;

import com.myapp.Entities.Account_Entity;

public class AccountEntitySingleton {
    private static AccountEntitySingleton instance;
    private Account_Entity accountEntity;

    private AccountEntitySingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static AccountEntitySingleton getInstance() {
        if (instance == null) {
            // Create a new instance if it doesn't exist
            instance = new AccountEntitySingleton();
        }
        return instance;
    }

    public Account_Entity getAccountEntity() {
        return accountEntity;
    }

    public void setAccountEntity(Account_Entity accountEntity) {
        // Update the instance with the new Account_Entity values
        this.accountEntity = accountEntity;
    }
}
