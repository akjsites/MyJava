package compareable;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		product []product= {new product(555, "Asii", 23444),new product(333, "eee", 53444),new product(222, "Aii", 27744)};
        Arrays.sort(product);
        for(product e:product )
        System.out.println(e);
	}

}
