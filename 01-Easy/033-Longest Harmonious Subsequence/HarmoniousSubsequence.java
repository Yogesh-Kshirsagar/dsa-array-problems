package com.study.com;

import java.util.*;

public class HarmoniousSubsequence {

    public static int findLHS(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 1: Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // Step 2: Check for harmonious pairs
        for (int key : freqMap.keySet()) {
            if (freqMap.containsKey(key + 1)) {
                int currLength = freqMap.get(key) + freqMap.get(key + 1);
                maxLength = Math.max(maxLength, currLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(nums1)); // Output: 5

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(findLHS(nums2)); // Output: 2

        int[] nums3 = {1, 1, 1, 1};
        System.out.println(findLHS(nums3)); // Output: 0
    }
}
