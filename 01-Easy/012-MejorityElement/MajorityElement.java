package org.example.arrays.easy;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // First pass to find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        // No need to verify the candidate, as the problem guarantees majority exists
        return candidate;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element in nums1: " + majorityElement(nums1)); // Output: 3
        System.out.println("Majority Element in nums2: " + majorityElement(nums2)); // Output: 2
    }
}
