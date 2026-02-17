package com.aswini;

public class LoanNotAllowedException extends RuntimeException {
    public LoanNotAllowedException(String name)
    {
 	   super(name);
    }
}
