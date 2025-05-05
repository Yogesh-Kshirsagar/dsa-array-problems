package com.study.com;

public class ImageSmoother {
    public static int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] res = new int[m][n];

        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0, count = 0;

                for (int k = 0; k < 9; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];

                    if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        sum += img[ni][nj];
                        count++;
                    }
                }

                res[i][j] = sum / count;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] img1 = {{1,1,1},{1,0,1},{1,1,1}};
        printMatrix(imageSmoother(img1)); // Expected: [[0,0,0],[0,0,0],[0,0,0]]

        int[][] img2 = {{100,200,100},{200,50,200},{100,200,100}};
        printMatrix(imageSmoother(img2)); // Expected: [[137,141,137],[141,138,141],[137,141,137]]
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}

