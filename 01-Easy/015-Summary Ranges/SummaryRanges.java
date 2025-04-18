package org.example.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int start = nums[i];

            // Move forward while numbers are consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (start == nums[i]) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[i]);
            }

            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        int[] nums3 = {};

        System.out.println(summaryRanges(nums1)); // ["0->2", "4->5", "7"]
        System.out.println(summaryRanges(nums2)); // ["0", "2->4", "6", "8->9"]
        System.out.println(summaryRanges(nums3)); // []
    }
}
