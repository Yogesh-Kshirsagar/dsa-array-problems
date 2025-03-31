package org.example.arrays.easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create an array of indices to keep track of original positions
        int n = nums.length;
        int[][] indexedNums = new int[n][2];

        // Fill the indexedNums array with values and their original indices
        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i]; // value
            indexedNums[i][1] = i;       // original index
        }

        // Sort the array based on the values
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));

        // Two pointers: left and right
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];

            if (sum == target) {
                // Return the original indices of the pair
                return new int[] {indexedNums[left][1], indexedNums[right][1]};
            } else if (sum < target) {
                left++;  // We need a larger sum, move left pointer to the right
            } else {
                right--; // We need a smaller sum, move right pointer to the left
            }
        }

        // Return an empty array if no solution found (not possible according to problem)
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test cases
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Result: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Result: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Result: [" + result3[0] + ", " + result3[1] + "]");
    }
}
