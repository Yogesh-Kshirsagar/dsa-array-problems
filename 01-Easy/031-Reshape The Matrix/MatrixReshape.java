package com.study.com;

public class MatrixReshape {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate new row and column in reshaped matrix
                int row = count / c;
                int col = count % c;
                reshaped[row][col] = mat[i][j];
                count++;
            }
        }

        return reshaped;
    }

    // Helper method to print the matrix (for demonstration)
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] result1 = matrixReshape(mat1, 1, 4);
        printMatrix(result1); // Output: [[1, 2, 3, 4]]

        int[][] mat2 = {{1, 2}, {3, 4}};
        int[][] result2 = matrixReshape(mat2, 2, 4);
        printMatrix(result2); // Output: [[1, 2], [3, 4]]
    }
}

