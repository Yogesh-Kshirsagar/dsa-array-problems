package org.example.arrays.easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add one and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and move to the next digit
            digits[i] = 0;
        }

        // If all digits were 9, we need to add a 1 at the beginning
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // Set the first digit to 1
        // The rest are already initialized to 0 due to the array creation
        return result;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();

        // Test case 1: [1, 2, 3] => [1, 2, 4]
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.print("Result 1: ");
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
        System.out.println();  // Output: [1, 2, 4]

        // Test case 2: [4, 3, 2, 1] => [4, 3, 2, 2]
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.print("Result 2: ");
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        System.out.println();  // Output: [4, 3, 2, 2]

        // Test case 3: [9] => [1, 0]
        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        System.out.print("Result 3: ");
        for (int digit : result3) {
            System.out.print(digit + " ");
        }
        System.out.println();  // Output: [1, 0]

        // Test case 4: [9, 9, 9] => [1, 0, 0, 0]
        int[] digits4 = {9, 9, 9};
        int[] result4 = solution.plusOne(digits4);
        System.out.print("Result 4: ");
        for (int digit : result4) {
            System.out.print(digit + " ");
        }
        System.out.println();  // Output: [1, 0, 0, 0]
    }

}
