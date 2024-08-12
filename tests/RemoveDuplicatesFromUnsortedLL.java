package com.Nikhil.tests;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}



public class RemoveDuplicatesFromUnsortedLL {

    public static Node removeDuplicates(Node head)
    {
        // Your code here
        ArrayList<Integer> elements = new ArrayList<>();

        Node node = head;
        elements.add(node.data);
        Node tail = head.next;
        //  if(node == null){
        //      return node;
        //  }

        while(tail != null){

            if(!elements.contains(tail.data)){
                // add the element to the array and then shift the node to the tail and tail to next node

                elements.add(tail.data);
                node.next = tail;
                node = tail;
            }
            else{
                node.next = null;
            }
            tail = tail.next;

        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(45);
        Node node = new Node(45);
        head.next = node;
        for (int i = 0; i < 5; i++) {
            Node temp = new Node(node.data);
            node.next = temp;
            node = temp;
            node.next = null;
        }
        node.next = null;

        printLL(head);
        removeDuplicates(head);
        printLL(head);
    }

    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
}
