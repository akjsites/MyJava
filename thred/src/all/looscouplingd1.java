package all;

import threading.demo1;

interface s 
{
	int main();
}
class cs implements s
{

	@Override
	public int main() {
		
		return 30;
	}
	
}
public class looscouplingd1 {

	public static void main(String[] args) {
		w(new cs());

	}
	public static void w(s s1)
	{
		int ni=s1.main();
		System.out.println(ni);
	}

}
