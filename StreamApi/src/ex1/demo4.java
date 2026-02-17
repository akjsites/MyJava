package ex1;

import java.util.Arrays;

public class demo4 {

	public static void main(String[] args) {
//		Integer []i= {-12,3,21,-43,65};
//		
//		Object[] array = Arrays.asList(i).stream().filter(n->n>0).toArray();
//       System.out.println(Arrays.toString(array));
		
		
//		String []name= {"Aswini","swioo","freasw","deeee","ssssa"};
//		Arrays.asList(name).stream().filter(s->(s.contains("A") || s.contains("a"))).forEach(s->System.out.println(s));
		
//		Integer []n= {1,2,3,4,5,6,7,8,9};
//		Arrays.stream(n).filter(num->isprime(num)).forEach(a->System.out.println(a));
		
		
		String []name= {"Aswini","swioo","frf","deeee","ssssa"};
		Arrays.asList(name).stream().filter(s->ispalin(s)).forEach(s->System.out.println(s));
		
		
		
	}
	public static boolean isprime(Integer num)
	{
		int c=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)c++;
		}
		if(c==2)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean ispalin(String name)
	{
		
		char p[]=name.toCharArray();
		String na="";
		for(int n=p.length-1;n>=0;n--)
		{
			na+=p[n];
		}
		if(na.equals(name))
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
