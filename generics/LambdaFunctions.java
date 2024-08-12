package com.Nikhil.generics;

import java.util.ArrayList;

public class LambdaFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        System.out.println(arr.contains(10));

//        arr.forEach((item) -> System.out.print(item * 2+", "));

    }


    int sum(int a, int b){
        return a + b;
    }
}
