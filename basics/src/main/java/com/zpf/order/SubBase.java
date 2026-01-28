package com.zpf.order;

public class SubBase extends Base {
    // 静态变量、静态块执行顺序，按书写先后顺序
    public static int a1 = getSuperStaticNumber();
    public int b1 = getSuperInstanceNumber();

    public SubBase()
    {
        System.out.println("----SubBase---: Init SuperClass " + this.b1);
    }

    static
    {
        System.out.println("----SubBase---: Static Init SuperClass " + a1);
    }

    public static int getSuperStaticNumber()
    {
        System.out.println("----SubBase---: Static member init");
        return 100;
    }

    public int getSuperInstanceNumber()
    {
        System.out.println("----SubBase---: Instance member init");
        return 200;
    }
}