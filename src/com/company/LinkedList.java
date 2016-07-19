package com.company;

/**
 * Created by jwang on 7/19/16.
 */
public class LinkedList {

    protected Node head;
    protected int size;

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public void add(String key, int value, Node next){
        Node newNode = new Node(key, value, null);

        if (isEmpty()){
            head = newNode;
        } else {
            Node temp = head;

            while(temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(newNode);
        }

    }

    public double average(String k){
        int average;
        //while(head.getKey().equals(k.getKey()))

        return 0;
    }


}
