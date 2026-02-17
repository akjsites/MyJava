package www.aswini.java.dataonlinework.ctr;

public class ShopKeeper {

	public static void main(String[]args)
	{
      float total=32500;
      float profit=total/100*29;
      float vat =total/100*12.7f;
      float serviceCharge=total/100*3.87f;
      float totalShell=total+profit+vat+serviceCharge;
      System.out.println("profit : "+profit);
      System.out.println("total shell price : "+totalShell);
      System.out.println("vat: "+vat);
      System.out.println("service charge : "+serviceCharge);
    
	} 
}
