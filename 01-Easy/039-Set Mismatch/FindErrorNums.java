package com.study.com;

public class FindErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];

        // Count frequency
        for (int num : nums) {
            count[num]++;
        }

        int duplicate = -1, missing = -1;

        // Find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] res1 = findErrorNums(new int[]{1, 2, 2, 4});
        System.out.println("[" + res1[0] + ", " + res1[1] + "]"); // Output: [2, 3]

        int[] res2 = findErrorNums(new int[]{1, 1});
        System.out.println("[" + res2[0] + ", " + res2[1] + "]"); // Output: [1, 2]
    }
}
