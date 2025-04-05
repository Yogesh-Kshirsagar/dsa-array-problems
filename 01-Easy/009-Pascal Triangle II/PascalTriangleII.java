package org.example.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        // Start with the first element of the row, which is always 1
        long value = 1;
        row.add((int) value);  // Add the first element to the row

        // Compute the rest of the elements using the formula
        for (int j = 1; j <= rowIndex; j++) {
            // Use the iterative relation to compute each element
            value = value * (rowIndex - j + 1) / j;
            row.add((int) value);  // Cast to int before adding to the list
        }

        return row;
    }

    public static void main(String[] args) {
        PascalTriangleII solution = new PascalTriangleII();

        // Example 1:
        int rowIndex1 = 3;
        List<Integer> result1 = solution.getRow(rowIndex1);
        System.out.println("Row " + rowIndex1 + ": " + result1);

        // Example 2:
        int rowIndex2 = 0;
        List<Integer> result2 = solution.getRow(rowIndex2);
        System.out.println("Row " + rowIndex2 + ": " + result2);

        // Example 3:
        int rowIndex3 = 1;
        List<Integer> result3 = solution.getRow(rowIndex3);
        System.out.println("Row " + rowIndex3 + ": " + result3);
    }
}
