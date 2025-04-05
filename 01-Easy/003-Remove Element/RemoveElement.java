package org.example.arrays.easy;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;  // Pointer to track the position to insert elements that are not equal to val

        // Iterate through the array
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {  // If the current element is not equal to val
                nums[i] = nums[j];  // Place it at the 'i' index
                i++;  // Increment 'i' to the next position
            }
        }

        // Return the number of elements that are not equal to val
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

}
