package com.zpf.order;

public class Sub extends SubBase {
    public static int a2 = getStaticNumber();
    public int b2 = getInstanceNumber();

    public Sub()
    {
        System.out.println("----Sub---: Init SubClass " + this.b2);
    }

    public static int getStaticNumber()
    {
        System.out.println("----Sub---: Static member init Sub");
        return 1000;
    }

    public int getInstanceNumber()
    {
        System.out.println("----Sub---: Instance member init Sub");
        return 2000;
    }

    static
    {
        System.out.println("----Sub---: Static Init " + a2);
    }

    /**
     * 程序入口,main
     */
    public static void main(String args[])
    {
        new Sub();
    }
}