package com.product.bean;

public class account {
     private int ACCOUNT_NO;
     private String NAME;
     private int ADHAR_NO;
     private String BANK_NAME;
     private double BALANCE;
     private String ADDRESS;
	
	 public account(int aCCOUNT_NO, String nAME, int aDHAR_NO, String bANK_NAME, double bALANCE, String aDDRESS) {
		super();
		ACCOUNT_NO = aCCOUNT_NO;
		NAME = nAME;
		ADHAR_NO = aDHAR_NO;
		BANK_NAME = bANK_NAME;
		BALANCE = bALANCE;
		ADDRESS = aDDRESS;
	}

	 public int getACCOUNT_NO() {
		 return ACCOUNT_NO;
	 }

	 public void setACCOUNT_NO(int aCCOUNT_NO) {
		 ACCOUNT_NO = aCCOUNT_NO;
	 }

	 public String getNAME() {
		 return NAME;
	 }

	 public void setNAME(String nAME) {
		 NAME = nAME;
	 }

	 public int getADHAR_NO() {
		 return ADHAR_NO;
	 }

	 public void setADHAR_NO(int aDHAR_NO) {
		 ADHAR_NO = aDHAR_NO;
	 }

	 public String getBANK_NAME() {
		 return BANK_NAME;
	 }

	 public void setBANK_NAME(String bANK_NAME) {
		 BANK_NAME = bANK_NAME;
	 }

	 public double getBALANCE() {
		 return BALANCE;
	 }

	 public void setBALANCE(double bALANCE) {
		 BALANCE = bALANCE;
	 }

	 public String getADDRESS() {
		 return ADDRESS;
	 }

	 public void setADDRESS(String aDDRESS) {
		 ADDRESS = aDDRESS;
	 }
	 
}
