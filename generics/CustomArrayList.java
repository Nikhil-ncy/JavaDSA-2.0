package com.Nikhil.generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {

        int[] temp = new int[data.length * 2];

        //copy the elements of data to temp

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull(){
        return data.length == size;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }
    


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(45);
        list.add("Nikhil");
        list.remove(0);
        list.get(0);
        list.size();
        list.isEmpty();

        CustomArrayList list2 = new CustomArrayList();

    }
}
