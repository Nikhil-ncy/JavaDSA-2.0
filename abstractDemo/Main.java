package com.Nikhil.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(28);
        son.career("doctor");
        son.normal();

        Daughter daughter = new Daughter(25);
        daughter.career("coder");
        Parent.hello();

//        Parent mom = new Parent(); we can't create the object of an abstract class
    }
}
