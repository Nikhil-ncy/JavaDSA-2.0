package com.Nikhil.Heaps;

import java.util.Arrays;

public class HeapFromUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        HeapFromUnsortedArray obj = new HeapFromUnsortedArray();
        obj.createHeap(arr);
        System.out.println(Arrays.toString(arr));
    }

    void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
    int left(int index){
        return (2*index)+1;
    }
    int right(int index){
        return (2*index)+2;
    }

    public void createHeap(int[] nums){
        int n = nums.length;
        for(int i = (n/2-1); i >= 0; i--){
            heapify(nums, n, i);
        }
        // Extract elements one by one
        for (int i = n - 1; i >= 0; i--) {
            swap(nums, 0, i);

            heapify(nums, i, 0);
        }
    }
    private void heapify(int[] nums, int n, int i){
        int smallest = i;
        int left = left(i);
        int right = right(i);

        if(left >= n){
            return;
        }

        if(left < n && nums[smallest] < nums[left]){
            smallest = left;
        }
        if(right < n && nums[smallest] < nums[right]){
            smallest = right;
        }

        if(smallest != i){
            swap(nums, smallest, i);
            heapify(nums, n, smallest);
        }
    }
}
