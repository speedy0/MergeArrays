package com.sparta.an;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    @DisplayName("Is array sorted correctly")
    void isArraySortedCorrectly(){
    int[] array1 = {5, 7, 9, 11, 13, 15, 19, 25};
    int[] array2 = {3, 6, 12, 17, 150, 350, 355, 358};
    int[] expected = {3, 5, 6, 7, 9, 11, 12, 13, 15, 17, 19, 25, 150, 350, 355, 358};
    Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MergeSort.mergeSorter(array1,array2)));
    }

    @Test
    @DisplayName("Different sized arrays")
    void differentSizedArrays(){
        int[] array1 = {5, 7, 13, 15, 19, 25};
        int[] array2 = {3, 6, 12, 17, 150, 350, 355, 358};
        int[] expected = {3, 5, 6, 7, 12, 13, 15, 17, 19, 25, 150, 350, 355, 358};
    Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MergeSort.mergeSorter(array1,array2)));
    }

    @Test
    @DisplayName("One array is smaller than the other")
    void oneArrayIsSmallerThanTheOther(){
        int[] array1 = {5, 7, 13, 15, 19, 25};
        int[] array2 = {350, 355, 358};
        int[] expected = {5, 7, 13, 15, 19, 25, 350, 355, 358};
    Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MergeSort.mergeSorter(array1,array2)));
    }

}
