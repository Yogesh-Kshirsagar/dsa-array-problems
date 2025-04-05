package org.example.arrays.easy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR each number with the result
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        // Example 1:
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number in nums1: " + solution.singleNumber(nums1));  // Output: 1

        // Example 2:
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single number in nums2: " + solution.singleNumber(nums2));  // Output: 4

        // Example 3:
        int[] nums3 = {1};
        System.out.println("Single number in nums3: " + solution.singleNumber(nums3));  // Output: 1
    }
}
