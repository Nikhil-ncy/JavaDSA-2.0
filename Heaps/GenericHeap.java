package com.Nikhil.Heaps;
import java.util.ArrayList;
import java.util.Arrays;

public class GenericHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    GenericHeap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return ((index-1) / 2);
    }
    private int left(int index){
        return 2*index + 1;
    }
    private int right(int index){
        return 2*(index+1);
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }

    private void upHeap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }
        T temp = list.get(0);

        T last = list.removeLast();
        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }

        return temp;
    }

    public void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if(min != index){
            swap(index, min);
            downHeap(min);
        }

    }
    public void print(){
        System.out.println(Arrays.toString(list.toArray()));
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> sorted = new ArrayList<>();
        while(!list.isEmpty()) {
            sorted.add(remove());
        }
        return sorted;
    }

    public static <T> void main(String[] args) throws Exception {
        GenericHeap<Integer> obj = new GenericHeap<>();
        obj.insert(8);
        obj.insert(7);
        obj.insert(9);
        obj.insert(10);
        obj.insert(11);
        obj.insert(12);
        obj.insert(14);
        obj.insert(13);
        obj.insert(5);
        obj.print();
//        T removed = (T) obj.remove();
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        obj.print();

        // heap sort
        ArrayList<T> sorted = (ArrayList<T>) obj.heapSort();
        System.out.println(Arrays.toString(sorted.toArray()));
    }
}
