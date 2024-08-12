package com.Nikhil.access;

public class SubClass extends A{

    SubClass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(34, "Nikhil");
        int n = obj.getNum();

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof Object);
    }
}
