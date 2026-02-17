package array;

import java.util.Arrays;

public class p5 {

	public static void main(String[] args) {
		int []arr= {1 ,2, 3, 2 ,4 ,1 ,6};
       for(int i=0;i<arr.length;i++)
       {
    	   	for(int j=i+1;j<arr.length-1;j++)
           {
        	       if(arr[i]>arr[j])
        	       {
        	    	   int t=arr[i];
        	    	   arr[i]=arr[j];
        	    	   arr[j]=t;
        	       }
           }
       }
       int c=0;
//       System.out.println(Arrays.toString(arr));
       for(int x=arr.length;x>0;x--)
       {
    	      c++;
    	      if(c==4) {
    		   System.out.println(x);
    	      }
    	   
       }
	}

}
