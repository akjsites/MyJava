package com.lab.blc;
import java.util.Scanner;

public class FanScenario
{
    public static void main(String[] args){
        Fan fun=new Fan();
        Scanner sc=new Scanner(System.in);
       
        String fanName=sc.next();
        String coilName=sc.next();
        int wingNo=sc.nextInt();
         fun.name=fanName;
          fun.coil=coilName;
          fun.wings=wingNo;
          System.out.println("Fan Name : "+fun.name);
       System.out.println("Fan Coil    :  "+fun.coil);
       System.out.println("Fan Wings   : "+fun.wings);
          fun.sitchOn();
          fun.swithOff();
          sc.close();
    }
}
