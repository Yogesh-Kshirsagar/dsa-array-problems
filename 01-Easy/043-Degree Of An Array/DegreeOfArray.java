package com.study.com;

import java.util.*;

public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        Map<Integer, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (!firstIndexMap.containsKey(num)) {
                firstIndexMap.put(num, i);
            }
            lastIndexMap.put(num, i);
        }

        int degree = Collections.max(countMap.values());
        int minLength = nums.length;

        for (int num : countMap.keySet()) {
            if (countMap.get(num) == degree) {
                int length = lastIndexMap.get(num) - firstIndexMap.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }

    // Sample test
    public static void main(String[] args) {
        DegreeOfArray solution = new DegreeOfArray();
        System.out.println(solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1})); // Output: 2
        System.out.println(solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2})); // Output: 6
    }
}

