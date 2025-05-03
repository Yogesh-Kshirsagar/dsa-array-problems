package org.example.arrays.easy;

import java.util.Arrays;

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0 || duration == 0) return 0;

        int totalPoisonedTime = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int timeDiff = timeSeries[i + 1] - timeSeries[i];
            // If there's an overlap, only add the non-overlapping part
            totalPoisonedTime += Math.min(timeDiff, duration);
        }

        // Add duration for the last attack
        totalPoisonedTime += duration;

        return totalPoisonedTime;
    }

    public static void main(String[] args) {
        int[] timeSeries1 = {1, 4};
        System.out.println(findPoisonedDuration(timeSeries1, 2)); // Output: 4

        int[] timeSeries2 = {1, 2};
        System.out.println(findPoisonedDuration(timeSeries2, 2)); // Output: 3
    }
}
