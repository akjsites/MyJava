package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import Customer.inputstream;

public class properties {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("A:\\Main\\SBoot\\mysql.properties");
		Properties p=new Properties();
		p.load(file);
		Set<Entry<Object, Object>> entrySet = p.entrySet();
		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			Entry<Object, Object> next = iterator.next();
			System.out.println(next.getKey()+" "+next.getValue());
		}

	}

}
