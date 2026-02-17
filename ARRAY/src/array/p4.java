package array;

public class p4 {

	public static void main(String[] args) {
		int []arr= {1,2,1,3,4,6,2,5,4,6};int e=0;int o=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2==0)
			{
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("even : "+e);
		System.out.println("odd : "+o);
	}

}
