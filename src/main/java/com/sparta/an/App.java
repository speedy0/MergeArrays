package com.sparta.an;

import java.util.Arrays;

import static com.sparta.an.MergeSort.mergeSorter;

public class App
{
    public static void main(String[] args )
    {
        int[] array1 = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] array2 = {0, 2, 4, 6, 8, 10, 12, 14};

        double startTime = System.nanoTime();
        System.out.println(Arrays.toString(mergeSorter(array1, array2)));
        double endTime = System.nanoTime();

        System.out.println(TimeTester.timeCalculator(startTime, endTime));
    }

}
