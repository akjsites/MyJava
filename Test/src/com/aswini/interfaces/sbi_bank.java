package com.aswini.interfaces;

public interface sbi_bank {
     void deposit();
     default void discountWithdraw()
     {
    	 System.out.println("any one ");
     }
}
