package com.wood.bean;
public class EmptyClass
{
    static
    {
        System.out.println("Enter EmptyClass.static block");
    }
    
    public EmptyClass()
    {
        System.out.println("Enter EmptyClass.construct()");
    }
    
    public void init()
    {
        System.out.println("Enter EmptyClass.init()");
    }
    
    public void destroy()
    {
        System.out.println("Enter EmptyClass.destory()");
    }
}