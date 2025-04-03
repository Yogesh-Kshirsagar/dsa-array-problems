package org.example.arrays.easy;

public class SearchInsertPosition {

    // Method to find the index of the target or the position where it would be inserted
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;  // To prevent overflow

            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] > target) {
                right = mid - 1;  // Search in the left half
            } else {
                left = mid + 1;  // Search in the right half
            }
        }

        // If target is not found, 'left' is the insertion point
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition object = new SearchInsertPosition();

        // Test case 1
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Insert position for target " + target1 + " is: " + object.searchInsert(nums1, target1));  // Output: 2

        // Test case 2
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Insert position for target " + target2 + " is: " + object.searchInsert(nums2, target2));  // Output: 1

        // Test case 3
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Insert position for target " + target3 + " is: " + object.searchInsert(nums3, target3));  // Output: 4

        // Test case 4 - Target less than the smallest element
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println("Insert position for target " + target4 + " is: " + object.searchInsert(nums4, target4));  // Output: 0

        // Test case 5 - Target greater than the largest element
        int[] nums5 = {1, 3, 5, 6};
        int target5 = 8;
        System.out.println("Insert position for target " + target5 + " is: " + object.searchInsert(nums5, target5));  // Output: 4
    }

}
