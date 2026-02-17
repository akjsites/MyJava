package thirdmax;

public class max3 {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,6,6,8,9,9};
		int y=0;int o=0,w=1;
		for(int i=0;i<arr.length;i++)
		{
			y=1;
			if(arr[i]==-1)continue;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] ) 
				{
				  y++;
				  arr[j]=-1;
				}
				
			}
			System.out.println(arr[i]+" "+y);
			
			
		}
		
	}
}
