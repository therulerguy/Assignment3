package com.company;

/**
 * Created by jwang on 7/19/16.
 */
public class Node {

    private String key;
    private int value;
    private Node next;

    public Node(String key, int value, Node next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public String getKey(){
        return key;
    }

    public void setKey(String s){
        key = s;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int v){
        value = v;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n){
        next = n;
    }


}
