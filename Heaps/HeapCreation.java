package com.Nikhil.Heaps;
import java.util.Scanner;
import java.util.Arrays;

public class HeapCreation {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()+1;
        int[] nums = new int[n];
        for(int i = 1; i < n; i++){
            System.out.println("Enter the value: ");
            int num = sc.nextInt();
            nums = insert(nums, num, i);
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    public static int[] insert(int[] nums, int num, int ind){
        nums[ind] = num;
        if(ind == 0){
            return nums;
        }

        //check if the inserted number is smaller than its parent or not
        boolean isSmaller = false;
        while(ind > 0 && nums[ind] < nums[ind/2]){
            int temp = nums[ind];
            nums[ind] = nums[ind/2];
            nums[ind/2] = temp;
            ind = ind/2;
        }
        return nums;
    }
}
