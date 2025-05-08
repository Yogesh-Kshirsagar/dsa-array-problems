package com.study.com;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If no character is greater than target, wrap around
        return letters[low % letters.length];
    }

    // Test code
    public static void main(String[] args) {
        NextGreatestLetter solver = new NextGreatestLetter();

        System.out.println(solver.nextGreatestLetter(new char[]{'c','f','j'}, 'a')); // c
        System.out.println(solver.nextGreatestLetter(new char[]{'c','f','j'}, 'c')); // f
        System.out.println(solver.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z')); // x
    }
}
