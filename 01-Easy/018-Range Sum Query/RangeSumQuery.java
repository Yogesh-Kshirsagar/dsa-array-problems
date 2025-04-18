package org.example.arrays.easy;

public class RangeSumQuery {
    private int[] prefixSum;

    public RangeSumQuery(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];

        // Build prefix sum array
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    public static void main(String[] args) {
        RangeSumQuery numArray = new RangeSumQuery(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2)); // Output: 1
        System.out.println(numArray.sumRange(2, 5)); // Output: -1
        System.out.println(numArray.sumRange(0, 5)); // Output: -3
    }
}
