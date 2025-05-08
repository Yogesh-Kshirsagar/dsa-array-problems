package com.study.com;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    // Sample test
    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));  // Output: 4
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));  // Output: -1
    }
}
