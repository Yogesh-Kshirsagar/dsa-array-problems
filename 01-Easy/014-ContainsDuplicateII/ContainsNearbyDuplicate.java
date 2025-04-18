package org.example.arrays.easy;

import java.util.HashSet;

public class ContainsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            // Maintain window size of at most k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 2, 3, 1, 2, 3};

        System.out.println(containsNearbyDuplicate(nums1, 3)); // true
        System.out.println(containsNearbyDuplicate(nums2, 1)); // true
        System.out.println(containsNearbyDuplicate(nums3, 2)); // false
    }
}
