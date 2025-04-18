package org.example.arrays.easy;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // First pass: move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Second pass: fill remaining elements with 0
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        printArray(nums1); // [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        printArray(nums2); // [0]
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
