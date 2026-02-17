package al;

public class round {

	public static int roundo(int x,int y,int z) {
		   int a=x%10;
		   int b=x%10;
		   int c=x%10;
		   int p=(a>5)?(a*10):(a+1)*10;
		   int q=(a>5)?(a*10):(a+1)*10;
		   int r=(a>5)?(a*10):(a+1)*10;
		    return p+q+r;
	}

}
//a = 23, b = 34, c = 66
//20 + 30 + 70 = 120
