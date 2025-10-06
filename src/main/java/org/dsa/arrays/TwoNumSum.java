package org.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumSum {
    public static void main(String[] args) {
    int[] result = twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
    System.out.println(Arrays.toString(result));
    }

    // O(n) time | O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Integer> storedNumbers = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            int sumUp = targetSum - array[i];
            if(storedNumbers.containsKey(sumUp)){
                return new int[] {sumUp, array[i]};
            }
            storedNumbers.put(array[i], i);
        }
        return new int[0];
    }
}