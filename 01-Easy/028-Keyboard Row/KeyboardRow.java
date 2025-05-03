package com.study.com;

import java.util.*;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (isInOneRow(lowerWord, row1) || isInOneRow(lowerWord, row2) || isInOneRow(lowerWord, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private static boolean isInOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] input1 = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(input1))); // Output: ["Alaska", "Dad"]

        String[] input2 = {"omk"};
        System.out.println(Arrays.toString(findWords(input2))); // Output: []

        String[] input3 = {"adsdf", "sfd"};
        System.out.println(Arrays.toString(findWords(input3))); // Output: ["adsdf", "sfd"]
    }
}
