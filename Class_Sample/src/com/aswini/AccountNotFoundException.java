package com.aswini;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String name)
    {
 	   super(name);
    }
}
