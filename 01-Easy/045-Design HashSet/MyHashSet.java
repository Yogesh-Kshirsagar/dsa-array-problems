package com.study.com;

import java.util.*;

class MyHashSet {
    private final int SIZE = 769; // Prime number for better distribution
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = buckets[index];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = buckets[index];
        bucket.remove((Integer) key); // Cast to avoid ambiguity with remove(index)
    }

    public boolean contains(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }
    
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println(myHashSet.contains(1)); // true
        System.out.println(myHashSet.contains(3)); // false
        myHashSet.add(2);
        System.out.println(myHashSet.contains(2)); // true
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2)); // false
    }
    
}
