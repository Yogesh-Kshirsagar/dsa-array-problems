package com.study.com;

import java.util.Arrays;

public class MaxProductOfThree {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // top 3 max values
        int product2 = nums[0] * nums[1] * nums[n - 1];         // 2 min (possibly negative) and max

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1, 2, 3}));       // Output: 6
        System.out.println(maximumProduct(new int[]{1, 2, 3, 4}));    // Output: 24
        System.out.println(maximumProduct(new int[]{-1, -2, -3}));    // Output: -6
        System.out.println(maximumProduct(new int[]{-10, -10, 5, 2}));// Output: 500
    }
}
