package org.example.arrays.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;  // If the array is empty, return 0

        int k = 1;  // Pointer to the next unique position in the array

        for (int i = 1; i < nums.length; i++) {
            // If the current number is not the same as the previous one
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];  // Move the unique number to the next unique position
                k++;  // Increment the position for the next unique number
            }
        }

        return k;  // The number of unique elements
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        // Test case 1
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + k1);  // Should print 2
        System.out.print("nums: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");  // Should print [1, 2]
        }
        System.out.println();

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + k2);  // Should print 5
        System.out.print("nums: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");  // Should print [0, 1, 2, 3, 4]
        }
    }
}

