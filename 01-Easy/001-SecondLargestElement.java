package org.example.arrays.easy;

import java.util.Arrays;

/**
Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
 Note: If the second-largest element does not exist, return -1.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second-largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second-largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second-largest element.
**/

public class SecondLargestElement {

    // function to find the second-largest element in the array
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // finding the second-largest element
        for (int j : arr) {

            // If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            }

            // If arr[i] < largest and arr[i] > second largest,
            // update second largest with arr[i]
            else if (j < largest && j > secondLargest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}
