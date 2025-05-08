package com.study.com;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        // If the color is same as target, no need to fill
        if (originalColor == color) return image;

        fill(image, sr, sc, originalColor, color);
        return image;
    }

    private void fill(int[][] image, int r, int c, int originalColor, int newColor) {
        // Check for out of bounds
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) return;

        // Only proceed if the current pixel is of the original color
        if (image[r][c] != originalColor) return;

        // Fill with the new color
        image[r][c] = newColor;

        // Recurse in all 4 directions
        fill(image, r + 1, c, originalColor, newColor); // down
        fill(image, r - 1, c, originalColor, newColor); // up
        fill(image, r, c + 1, originalColor, newColor); // right
        fill(image, r, c - 1, originalColor, newColor); // left
    }

    // Test example
    public static void main(String[] args) {
        FloodFill obj = new FloodFill();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int[][] result = obj.floodFill(image, 1, 1, 2);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
