package com.Nikhil.generics;

import java.util.ArrayList;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {

        Object[] temp = new Object[data.length * 2];

        //copy the elements of data to temp

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull(){
        return data.length == size;
    }

    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
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

        CustomGenArrayList list2 = new CustomGenArrayList();

    }
}
