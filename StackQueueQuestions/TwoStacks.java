package com.Nikhil.StackQueueQuestions;
import java.util.*;


public class TwoStacks {
    public static int twoStacks(List<Integer> a, List<Integer> b, int maxSum){
        int ans = twoStacks(a, b, maxSum, 0, 0);
        return ans - 1;
    }

    private static int twoStacks(List<Integer>a , List<Integer> b, int maxSum, int sum, int count){
        if (sum > maxSum){
            return count;
        }

        int left = count;
        int right = count;

        if (!a.isEmpty()){
            left = twoStacks(a.subList(1, a.size()), b, maxSum, sum + a.get(0), count + 1);
        }

        if (!b.isEmpty()){
            right = twoStacks(a, b.subList(1, b.size()), maxSum, sum + b.get(0), count + 1);
        }

        return Math.max(left, right);
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(1);
        a.add(6);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(1);
        b.add(8);
        b.add(5);

        System.out.println(twoStacks(a, b, 10));
    }
}
