package com.study.com;

public class OneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        return i == bits.length - 1;
    }

    // Sample test
    public static void main(String[] args) {
        OneBitCharacter obj = new OneBitCharacter();
        System.out.println(obj.isOneBitCharacter(new int[]{1, 0, 0})); // true
        System.out.println(obj.isOneBitCharacter(new int[]{1, 1, 1, 0})); // false
    }
}
