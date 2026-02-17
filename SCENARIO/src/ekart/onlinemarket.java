package ekart;

public class onlinemarket implements ekart,zepto,amzon,a_sites 
{
     private double disc =7;
     public double cal(double sum)
     {
    	 return sum-(sum*5);
     }
     public String benifits()
     {
    	 return "2 times casbacks";
     }
     public String benifit2()
     {
    	 return "2 time member Ships ";
     }
     public String benifit3()
     {
    	 return "1000 time order one android free ";
     }
}
