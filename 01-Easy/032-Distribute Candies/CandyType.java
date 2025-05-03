package com.study.com;

import java.util.*;

public class CandyType {

    public static int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        
        // Count distinct types
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // Maximum different types Alice can eat
        return Math.min(uniqueCandies.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        int[] candy1 = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(candy1)); // Output: 3

        int[] candy2 = {1, 1, 2, 3};
        System.out.println(distributeCandies(candy2)); // Output: 2

        int[] candy3 = {6, 6, 6, 6};
        System.out.println(distributeCandies(candy3)); // Output: 1
    }
}

