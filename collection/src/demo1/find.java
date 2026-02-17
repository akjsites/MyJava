package demo1;

import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
		ArrayList<demo> demos=new ArrayList<>();
		ArrayList<String> s=new ArrayList<>();
		s.add("fever");
		s.add("running");
		demo demo=new demo("aswini",s,"aswini" , "12345", "america");
		demo demo1=new demo("aswini",s,"aswiniKjn" , "123456", "London");
		demo demo2=new demo("aswini",s,"aswiniJena" , "123457", "Japan");
		servise se=new servise();
		
		se.add(demo);
		se.get();
		se.add(demo1);
		se.get();
		se.add(demo2);
		se.get();
		
		System.out.println(se.getdetail(104));
	}
}
