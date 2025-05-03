package com.study.com;

import java.util.Arrays;

public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int sum = 0;

        // Step 2: Add every alternate element (min of each pair)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums1)); // Output: 4

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums2)); // Output: 9
    }
}
