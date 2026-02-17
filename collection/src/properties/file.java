package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class file {
    public static void main(String[] args) throws IOException {
		File file=new File("A:\\Main\\SBoot\\mysql.properties");
		FileInputStream finp=new FileInputStream(file);
		while (true) {
             int i = finp.read();
             
             if(i==-1)break;
             
             System.out.print((char)i);
             
		}
	}
}
