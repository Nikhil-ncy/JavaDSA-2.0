package com.Nikhil.abstractDemo;

public abstract class Parent {

    int age;

    Parent(int age){
        this.age = age;
    }
    abstract void career(String name);
    abstract void partner(String name, int age);

    static void hello(){
        System.out.println("Heyy!!!");
    }

    void normal(){
        System.out.println("This is normal method.");
    }
}
