package com.wood.bean;
public class SingletonClass
{
    private static SingletonClass instance = new SingletonClass();
    
    private SingletonClass(){}
    
    public static SingletonClass getInstance()
    {
        return instance;
    }
}