package com.Nikhil.StackQueueQuestions;
import java.util.Stack;


public class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item){
        first.push(item);
    }

    public int pop(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public boolean empty(){
        return first.isEmpty();
    }

    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }

    public static void main(String[] args) {
        QueueUsingStacks obj = new QueueUsingStacks();
        obj.push(5);
        obj.push(2);
        System.out.println(obj.peek());
        System.out.println(obj.pop());

    }

}
