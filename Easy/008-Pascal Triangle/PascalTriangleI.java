package org.example.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleI {
    public List<List<Integer>> generate(int numRows) {
        // Create the list to hold all the rows of Pascal's Triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // Generate each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Each row has exactly one element at the start (which is 1)
            row.add(1);

            // Each row (except the first one) has elements in between
            for (int j = 1; j < i; j++) {
                // Each element is the sum of the two elements directly above it
                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(val);
            }

            // Each row has exactly one element at the end (which is 1)
            if (i > 0) {
                row.add(1);
            }

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangleI solution = new PascalTriangleI();

        // Example 1:
        int numRows1 = 5;
        List<List<Integer>> result1 = solution.generate(numRows1);
        System.out.println("Pascal's Triangle with " + numRows1 + " rows: " + result1);

        // Example 2:
        int numRows2 = 1;
        List<List<Integer>> result2 = solution.generate(numRows2);
        System.out.println("Pascal's Triangle with " + numRows2 + " row: " + result2);
    }
}
