package com.aswini.multilevelinheritance1;

import java.util.Scanner;
public class animal
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        boolean b=sc.nextBoolean();
        String dn= sc.next();
        dog d1=new dog(n,b,dn);
        d1.tostring();
    }
}
class animal1
{
    private String name;
    public animal1(String name)
    {
       this.name=name;
    }
    public void seta(String name)
    {
      this.name=name;
    }
    public String getanimalname()
    {
        return name;
    }
}
class mamals extends animal1
{
    private boolean hasfar;
    public mamals(String name, boolean hasfar)
    {
        super(name);
       this.hasfar=hasfar;
    }
    public void setm(boolean hasfar)
    {
      this.hasfar=hasfar;
    }
    public boolean gettrue()
    {
        return hasfar;
    }
}
class dog extends mamals
{
    private String dname;
    public dog(String name,boolean hasfar,String dname)
    {
       super(name,hasfar);
       this.dname=dname;
    }
    public void set(String dname)
    {
      this.dname=dname;
    }
    public String get()
    {
        return dname;
    }
    public void tostring()
    {
       System.out.println("Animal Name: "+super.getanimalname());
       System.out.println("Has Fur: "+super.gettrue());
       System.out.println("Breed: "+this.get());
    }
}
