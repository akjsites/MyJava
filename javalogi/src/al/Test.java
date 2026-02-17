package al;

import java.util.*;
class demo
{
	public void show(int x,int y,Object ...arr1)
	{
		//System.out.println(Arrays.toString(arr1));
		for(Object z: arr1)
		{
			   
		      Integer data= (Integer) z;
		      int value=data.valueOf(10);
		      System.out.println(value);
		}
		    
	}
}

public class Test 
{
	
	public static void main(String ...args)
    {       
		demo b=new demo();
		    int []arr={1,2,3,4};
			System.out.println(Arrays.toString(arr));
			b.show(10,20,arr);
         
    }
    
}