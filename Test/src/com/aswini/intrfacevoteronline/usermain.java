package com.aswini.intrfacevoteronline;

public class usermain {
	static int count=0;
    public static voteronline getVoteronline(String ...name)
    {
    	     
    	     return new uservalidation();
    }
    public static voteronline getVoteronline(long...an)
    {
    	    
    	     return new uservalidation();
    }
    public static voteronline getVoteronline(voteronline v,int num,int...pin)
    {
    	     
    	     v.login();
    	     v.processing(num);
    	    
    	     v.sucess();
    	     return new uservalidation();
    }
}
