package com.aswini.classtest;

import java.util.Scanner;
import java.util.function.*;
public class fi
{
    public static void main(String []args)
    {
        Consumer<Integer> p1=num->System.out.println("Original value: "+num);
        Consumer<Integer> p2=num->System.out.println("After doubling the value: "+(num*2));
        Consumer<Integer> p3=num->System.out.println("After incrementing the value by 3: "+(num+3));
        Consumer<Integer> p4=num->System.out.println("After squaring the value: "+(num*num));
    }
    
    Scanner sc =new Scanner(System.in);
    int x=sc.nextInt();
    p1.accept(x);
    p2.accept(x);
    p3.accept(x);
    p4.accept(x);
}
}
