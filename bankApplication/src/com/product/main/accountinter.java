package com.product.main;
import com.product.bean.account;
public interface accountinter {
		
			    int AddCustomer(account p);
			    int FetchCustomer();
			    int DeleteCustomer(int p);
			    int DepositAmount(int id,double balance);
			    int WithdrawAmount(int id,double balance);
			    int ViewBalance(int p);


}
