package com.sparta.an;

public class MergeSort {
    static int[] mergeSorter(int[] array1, int[] array2){
        int arrayLengths = array1.length + array2.length;
        int[] sortedArray = new int[arrayLengths];

        int currArr1Ind = 0;
        int currArr2Ind = 0;

        mergeArray(array1, array2, arrayLengths, sortedArray, currArr1Ind, currArr2Ind);

        return sortedArray;
    }

    private static void mergeArray(int[] array1, int[] array2, int arrayLengths, int[] sortedArray, int currArr1Ind, int currArr2Ind) {
        for (int sortArrayIndex = 0; sortArrayIndex <= arrayLengths - 1; sortArrayIndex++){
            if (currArr1Ind > array1.length - 1){
                sortedArray[sortArrayIndex] = array2[currArr2Ind];
                currArr2Ind++;
            } else if (currArr2Ind > array2.length - 1){
                sortedArray[sortArrayIndex] = array1[currArr1Ind];
                currArr1Ind++;
            } else if (array1[currArr1Ind] < array2[currArr2Ind]){
                sortedArray[sortArrayIndex] = array1[currArr1Ind];
                currArr1Ind++;
            } else if (array2[currArr2Ind] < array1[currArr1Ind]){
                sortedArray[sortArrayIndex] = array2[currArr2Ind];
                currArr2Ind++;
            } else {
                sortedArray[sortArrayIndex] = array1[currArr1Ind];
                currArr1Ind++;
            }
        }
    }
}
