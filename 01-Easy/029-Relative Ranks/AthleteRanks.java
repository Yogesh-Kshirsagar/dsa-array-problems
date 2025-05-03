package com.study.com;

import java.util.*;

public class AthleteRanks {
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        
        // Step 1: Create a list of pairs (score, original index)
        List<int[]> scoreWithIndex = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scoreWithIndex.add(new int[]{score[i], i});
        }
        
        // Step 2: Sort the list by score in descending order
        scoreWithIndex.sort((a, b) -> Integer.compare(b[0], a[0]));
        
        // Step 3: Assign ranks
        for (int i = 0; i < n; i++) {
            int index = scoreWithIndex.get(i)[1];
            if (i == 0) {
                result[index] = "Gold Medal";
            } else if (i == 1) {
                result[index] = "Silver Medal";
            } else if (i == 2) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(i + 1);  // For 4th place onwards
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] score1 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(score1))); // ["Gold Medal","Silver Medal","Bronze Medal","4","5"]

        int[] score2 = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(score2))); // ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
    }
}
