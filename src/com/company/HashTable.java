package com.company;

/**
 * Created by jwang on 7/19/16.
 */
public class HashTable {

    private LinkedList[] hashTable = new LinkedList[11];

    public int hash(String key){
        return key.hashCode();
    }

    public void put(String key, int value){
        int keyValue = hash(key) % 11;
        if(hashTable[keyValue] == null){
            hashTable[keyValue] = new LinkedList();
        }
        hashTable[keyValue].add(key, value, null);
    }

    public int get(String key){
        return 0;
    }


    public int remove(int key){
        return key;
    }



}
