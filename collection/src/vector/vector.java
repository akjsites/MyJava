package vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
class demo implements Runnable
{
	public Vector<Integer> xIntegers;
	public demo(Vector<Integer> x)
	{
		this.xIntegers=x;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		xIntegers.add(6);
	}
	
}
public class vector {

	public static void main(String[] args) throws InterruptedException {
		Vector vector=new Vector();
		vector.add(new Integer(1));
		vector.add(new Integer(3));
		vector.add(new Integer(4));
		vector.add(new Integer(5));
		vector.add(new Integer(7));
		new Thread(new demo(vector)).start();
		Iterator iterable=vector.iterator();
		while(iterable.hasNext())
		{
			Thread.sleep(500);
			System.out.println(iterable.next());
			
		}
	}

}
