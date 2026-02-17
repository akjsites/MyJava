package com.aswini.intrfacevoteronline;

public class servive {

	String servivename=null;
	public String getname1( String  username)
	{
		if(username=="modi")
		{
			this.servivename= "modi";
		}
		else if(username=="donal"){
			this.servivename= "donal";
		}
		else {
			this.servivename= "mohan Maji";
		}
		return servivename;
		
	}

}
