package towd_array_sorting;

public class towd_array_sorting {

	public static void main(String[] args) {
		int sum=0;
		int [][]arrsort= {{1,2,3,4},{1,1,1,1},{9,9}};
		int []sort=new int[arrsort.length];
     for(int i=0;i<arrsort.length;i++)
     {
    	     for(int j=0;j<arrsort[i].length;j++)
    	     {
    	    	    sum+=j;
    	    	    
    	     }
    	     sort[i]=sum;
    	    
     }
	}

}
