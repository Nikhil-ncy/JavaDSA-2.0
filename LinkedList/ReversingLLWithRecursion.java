package com.Nikhil.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class ReversingLLWithRecursion {

    public static Node supHead;

    public static void main(String[] args) {
        Node head = new Node(45);
        Node node = new Node(56);
        head.next = node;
        Node temp = new Node(4);
        node.next = temp;
        node = node.next;
        temp = new Node(9);
        node.next = temp;
        node = node.next;
        temp = new Node(89);
        node.next = temp;
        node = node.next;

        printLL(head);

        supHead = head;
        Node tail = head;

        tail = reverse(tail);
        head = supHead;
        printLL(head);
    }


    /**
     * Iterate till you find the tail
     * after finding the tail make it the new head and keep the tail there only
     * return the tail of the current LL considering that this tail is the final tail
     * when the previous call is made if this is not the last one then make the tail.next =
     * currTail then return it.
     * */
    static Node reverse(Node tail){

        if(tail.next == null){
            // tail is reached
            supHead = tail;
            return tail;
        }

        Node nextTail = reverse(tail.next);
        nextTail.next = tail;
        tail.next = null;
        return tail;
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
