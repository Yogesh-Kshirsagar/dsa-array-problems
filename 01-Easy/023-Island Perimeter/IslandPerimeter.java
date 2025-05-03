package org.example.arrays.easy;

import java.util.Arrays;

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // Start with 4 sides
                    perimeter += 4;

                    // If there's land below, subtract 2 (shared edge)
                    if (i + 1 < rows && grid[i + 1][j] == 1) {
                        perimeter -= 2;
                    }

                    // If there's land to the right, subtract 2 (shared edge)
                    if (j + 1 < cols && grid[i][j + 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
            {0,1,0,0},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
        };
        System.out.println(islandPerimeter(grid1)); // Output: 16

        int[][] grid2 = {
            {1}
        };
        System.out.println(islandPerimeter(grid2)); // Output: 4

        int[][] grid3 = {
            {1,0}
        };
        System.out.println(islandPerimeter(grid3)); // Output: 4
    }
}
