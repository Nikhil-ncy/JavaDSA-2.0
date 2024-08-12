package com.Nikhil.Heaps;

import java.util.Arrays;

public class HeapCreation2 {
    public static void main(String[] args) {

        int[] arr = {8, 7, 9, 10, 11, 12, 14, 13, 5};
        int n = arr.length + 1;
        int k = 0;
        int last = 0;
        int[] nums = new int[n];
        for(int i = 1; i < n; i++){
            int num = arr[k++];
            nums = insert(nums, num, i);
            last++;
        }
//        System.out.println(nums.length == last);
        System.out.println("Nums before removal: "+Arrays.toString(Arrays.copyOfRange(nums, 1, last+1)));
//        nums = remove(nums, last);
//        last--;
//        System.out.println("Nums after removal: "+Arrays.toString(Arrays.copyOfRange(nums, 1, last+1)));

        //Heap Sort
        int[] sorted = new int[nums.length];
        k = 1;
        sorted[0] = nums[1];
        while(last > 1){
            sorted[k++] = remove(nums, last)[1];
            last--;
        }
        System.out.println("Sorted array: "+Arrays.toString(Arrays.copyOfRange(sorted, 0, sorted.length-1)));
    }

    public static int[] insert(int[] nums, int num, int ind){
        nums[ind] = num;
        if(ind == 0){
            return nums;
        }

        //check if the inserted number is smaller than its parent or not
        while(ind > 0 && nums[ind] < nums[ind/2]){
            int temp = nums[ind];
            nums[ind] = nums[ind/2];
            nums[ind/2] = temp;
            ind = ind/2;
        }
        return nums;
    }

    public static int[] remove(int[] nums, int last){
        int ind = 1;
        nums[1] = nums[last];
        // check if the number at ind is smaller than the left or the right
        int l = 2*ind;
        int r = 2*ind + 1;
        while(l < last && r < last){

            if(nums[l] < nums[r] && nums[l] < nums[ind]){
                    int temp = nums[l];
                    nums[l] = nums[ind];
                    nums[ind] = temp;
                    ind = l;
            }
            else if(nums[r] < nums[ind]){
                    int temp = nums[r];
                    nums[r] = nums[ind];
                    nums[ind] = temp;
                    ind = r;
            }
            l = 2*ind;
            r = 2*ind + 1;
        }
        if(l == last-1){
            if(nums[l] < nums[ind]) {
                int temp = nums[l];
                nums[l] = nums[ind];
                nums[ind] = temp;
            }
        }
        return nums;
    }
}
