package com.aybars;

public class Challenge1
{
  /*
  Modify the merge sort algorithm
  so it sorts in the DESCENDING order
   */
  public static void main(String[] args)
  {
    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    mergeSort(intArray, 0, intArray.length);

    Helpers.printArray(intArray);
  }

  public static void mergeSort(int[] input, int start, int end)
  {

//    base case is the 1 element array
    if (end - start < 2) return;

//    partition the array we have been passed in any iteration
    int mid = (start + end) / 2;

//    mergesort on the left part of the array
    mergeSort(input, start, mid);

//    mergesort on the right part of the array
    mergeSort(input, mid, end);

    mergeDescending(input, start, mid, end);
  }

  public static void mergeDescending(int[] input, int start, int mid, int end)
  {
//    we are always merging sorted arrays -- this means all the elements are sorted
    if (input[mid - 1] >= input[mid]) return;

    int i = start;
    int j = mid;
    int tempIndex = 0; // keep track of where we are in the temporary array

    int[] temp = new int[end - start];

//    step through the left and right arrays and compare them
    while (i < mid && j < end)
    {
//      we will write the smaller of the 2 into the temp array
      temp[tempIndex++] = input[i] >= input[j]
          ? input[i++]
          : input[j++];
    }

//    second optimisation
//    if we have elements remaining int he left partition copy them to the temp array
//    but if elements remaining in the right partition we dont have to do anything
    System.arraycopy(input, i, input, start + tempIndex, mid - i);

    System.arraycopy(temp, 0, input, start, tempIndex);

  }
}
