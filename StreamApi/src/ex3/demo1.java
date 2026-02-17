package ex3;
interface myref<T,U,V,R>
{
	R appll(T t,U u,V v);
}
class mydemo
{
	public Integer domul(String num1,String num2)
	{
		return Integer.parseInt(num1)+Integer.parseInt(num2);
	}
}
public class demo1 {

	public static void main(String[] args) {
		myref<mydemo,String,String,Integer> myo=(my,s1,s2)->my.domul(s1, s2);
		  System.out.println(myo.appll(new mydemo(), "120", "678"));

		  myref<mydemo,String,String,Integer> myo1=mydemo::domul;
		  Integer ap = myo1.appll(new mydemo(), "500", "7000");
		  System.out.println(ap);
	}

}
