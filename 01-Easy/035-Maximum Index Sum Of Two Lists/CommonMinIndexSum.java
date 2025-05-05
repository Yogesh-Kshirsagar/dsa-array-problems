package com.study.com;

import java.util.*;

public class CommonMinIndexSum {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        // Step 1: Store list1 elements and their indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int minIndexSum = Integer.MAX_VALUE;

        // Step 2: Check list2 for common strings and calculate index sums
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = map.get(list2[j]) + j;
                if (indexSum < minIndexSum) {
                    result.clear(); // new minimum found
                    result.add(list2[j]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    result.add(list2[j]); // same minimum, add to list
                }
            }
        }

        // Step 3: Convert result list to array
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2))); // Output: ["Shogun"]

        String[] list3 = {"happy","sad","good"};
        String[] list4 = {"sad","happy","good"};
        System.out.println(Arrays.toString(findRestaurant(list3, list4))); // Output: ["sad", "happy"]
    }
}
