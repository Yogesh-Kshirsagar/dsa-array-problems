package org.example.arrays.easy;

import java.util.Arrays;

public class CookieDistribution {
    public static int findContentChildren(int[] g, int[] s) {
        // Sort the greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;  // Pointer for children
        int cookie = 0; // Pointer for cookies

        // Try to satisfy children one by one
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                // Cookie can satisfy the child
                child++;
            }
            // Move to the next cookie in any case
            cookie++;
        }

        return child; // Number of content children
    }

    // Example usage
    public static void main(String[] args) {
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(findContentChildren(g1, s1)); // Output: 1

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(findContentChildren(g2, s2)); // Output: 2
    }
}
