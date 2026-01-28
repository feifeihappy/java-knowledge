package com.zpf.order;

public class Base {
    public static int a = 10;
    public int b = 20;
    static
    {
        System.out.println("----Base---: Static Init Base " + a);
        // System.out.println("Null Init " + b);
    }

    public Base()
    {
        System.out.println("----Base---: Init Base " + this.b);
    }
}