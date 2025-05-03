package com.study.com;

import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse nums2 to build the nextGreaterMap
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                int smaller = stack.pop();
                nextGreaterMap.put(smaller, num);
            }
            stack.push(num);
        }

        // For remaining elements in the stack, no greater element exists
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Build the result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2))); // Output: [-1, 3, -1]

        int[] nums1b = {2, 4};
        int[] nums2b = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1b, nums2b))); // Output: [3, -1]
    }
}
