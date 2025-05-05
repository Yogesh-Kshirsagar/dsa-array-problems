package com.study.com;

public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Initial sum of first 'k' elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Step 2: Sliding window
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];  // Slide the window
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: Return average
        return maxSum / k;
    }

    public static void main(String[] args) {
        System.out.printf("%.5f\n", findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4)); // 12.75000
        System.out.printf("%.5f\n", findMaxAverage(new int[]{5}, 1)); // 5.00000
    }
}
