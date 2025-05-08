package com.study.com;

import java.util.*;

class MyHashMap {
    private static class Pair {
        int key, value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 769; // Use a prime number to reduce collisions
    private List<Pair>[] map;

    public MyHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            map[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        List<Pair> bucket = map[index];
        for (Pair pair : bucket) {
            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }
        bucket.add(new Pair(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        List<Pair> bucket = map[index];
        for (Pair pair : bucket) {
            if (pair.key == key) {
                return pair.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        List<Pair> bucket = map[index];
        bucket.removeIf(pair -> pair.key == key);
    }


    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        System.out.println(myHashMap.get(1)); // Output: 1
        System.out.println(myHashMap.get(3)); // Output: -1
        myHashMap.put(2, 1);
        System.out.println(myHashMap.get(2)); // Output: 1
        myHashMap.remove(2);
        System.out.println(myHashMap.get(2)); // Output: -1
    }
    
}
