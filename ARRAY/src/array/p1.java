package array;

public class p1 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,4,6,2,5,4,5,3,5};
	    for(int i=0;i<arr.length;i++)
	    {
	    	   int c=1;
	    	   int x=0;
	          for(int j=0;j<arr.length;j++)
	          {
	        	     if(arr[i]==arr[j] && i<j)c++;
	        	     if(arr[i]==arr[j] && i>j)x++;
	          }
	          if(x==0)
	          {
	        	  System.out.println(arr[i]+"="+i);
	          }
	         
	    
	    

	}

	}
}
