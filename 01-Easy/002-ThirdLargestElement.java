package org.example.arrays.easy;


/**
Given an array of n integers, the task is to find the third-largest element. All the elements in the array are distinct integers.

 Examples :

Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: 14
Explanation: Largest element is 20, second-largest element is 16 and third-largest element is 14

Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
Output: 16
Explanation: Largest element is 20, second-largest element is 19 and third-largest element is 16
**/
public class ThirdLargestElement {

    static int thirdLargest(int[] arr) {
        int n = arr.length;

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE,
                third = Integer.MIN_VALUE;

        for (int j : arr) {

            // If arr[i] is greater than first,
            // set third to second, second to
            // first and first to arr[i].
            if (j > first) {
                third = second;
                second = first;
                first = j;
            }

            // If arr[i] is greater than second,
            // set third to second and second
            // to arr[i].
            else if (j > second) {
                third = second;
                second = j;
            }

            // If arr[i] is greater than third,
            // set third to arr[i].
            else if (j > third) {
                third = j;
            }
        }

        // Return the third-largest element
        return third;
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargest(arr));
    }

}
