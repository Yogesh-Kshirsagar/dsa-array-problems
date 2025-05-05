package com.study.com;

public class MaxMatrixCount {
    public static int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;

        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        return minRow * minCol;
    }

    public static void main(String[] args) {
        int[][] ops1 = {{2, 2}, {3, 3}};
        System.out.println(maxCount(3, 3, ops1)); // Output: 4

        int[][] ops2 = {};
        System.out.println(maxCount(3, 3, ops2)); // Output: 9

        int[][] ops3 = {
            {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2},
            {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3},
            {3, 3}, {3, 3}
        };
        System.out.println(maxCount(3, 3, ops3)); // Output: 4
    }
}
