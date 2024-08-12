package com.Nikhil.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> { //it restricts only to take the classes of variables that exists in Number class

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public WildcardExample() {
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

    @Override
    public String toString() {
        return "WildcardExample{\n" +
                "data=" + Arrays.toString(data) +
                ",\nsize=" + size +
                "\n}";
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

    public void getList(List<? extends Number> list){
        //do something
        //List<Number> is only written for the type of the parameter then only Number class object can be passed and none of the subclass object will be passed
        //List<? extends Number> when this is written then any subclass object will also work
    }



    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.add("Nikhil");
//        list.remove(0);
//        list.get(0);
//        list.size();
//        list.isEmpty();

        WildcardExample<Number> list2 = new WildcardExample<>();
        list2.add(34);
        list2.add(67.0);
        list2.add(69.76f);
        list2.add(3454.67);
        System.out.println(list2);

    }
}
