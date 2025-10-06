package org.dsa.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidateSubsequence {

    public static void main(String[] args) {
        Boolean result = isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(1, 6, -1, 10));
        System.out.println(result);
    }

    // O(n) time | O(1) space
    /*public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayPointer = 0;
        int sequencePointer = 0;
        while (arrayPointer < array.size() && sequencePointer < sequence.size()){
            if(Objects.equals(sequence.get(sequencePointer), array.get(arrayPointer))){
                sequencePointer += 1;
            }
            arrayPointer += 1;
        }
        return sequencePointer == sequence.size();
    }*/

    // O(n) time | O(1) space
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int sequencePointer = 0;
        for(int value : array){
            if(sequencePointer == sequence.size())
                break;
            if(sequence.get(sequencePointer) == value)
                sequencePointer += 1;
        }
        return sequencePointer == sequence.size();
    }
}
