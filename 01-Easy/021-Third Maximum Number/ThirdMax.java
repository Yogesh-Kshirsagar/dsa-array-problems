package org.example.arrays.easy;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            long n = num;

            // Skip duplicates
            if ((first != null && n == first) ||
                    (second != null && n == second) ||
                    (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third != null ? third.intValue() : first.intValue();
    }

    // Test the function
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3, 2, 1}));       // Output: 1
        System.out.println(thirdMax(new int[]{1, 2}));          // Output: 2
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));    // Output: 1
        System.out.println(thirdMax(new int[]{1,2,2,5,3,5}));   // Output: 2
    }
}
