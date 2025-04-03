package org.example.arrays.easy;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers
        int i = m - 1;  // Pointer for the last element in nums1 (before the trailing zeros)
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in nums1 (the merged array)

        // Merge nums1 and nums2, starting from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // No need to handle remaining elements in nums1 because they are already in place
    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();

        // Test case 1: nums1 = [1, 2, 3, 0, 0, 0], nums2 = [2, 5, 6]
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int[] nums2_1 = {2, 5, 6};
        solution.merge(nums1_1, 3, nums2_1, 3);
        System.out.print("Merged Result 1: ");
        for (int num : nums1_1) {
            System.out.print(num + " ");
        }
        System.out.println();  // Expected: [1, 2, 2, 3, 5, 6]

        // Test case 2: nums1 = [1], nums2 = []
        int[] nums1_2 = {1};
        int[] nums2_2 = {};
        solution.merge(nums1_2, 1, nums2_2, 0);
        System.out.print("Merged Result 2: ");
        for (int num : nums1_2) {
            System.out.print(num + " ");
        }
        System.out.println();  // Expected: [1]

        // Test case 3: nums1 = [0], nums2 = [1]
        int[] nums1_3 = {0};
        int[] nums2_3 = {1};
        solution.merge(nums1_3, 0, nums2_3, 1);
        System.out.print("Merged Result 3: ");
        for (int num : nums1_3) {
            System.out.print(num + " ");
        }
        System.out.println();  // Expected: [1]
    }

}
