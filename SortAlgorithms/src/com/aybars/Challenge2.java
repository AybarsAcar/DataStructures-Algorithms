package com.aybars;

public class Challenge2
{
  /*
  Change the insertions sort
  so it is a recursive implementation
   */

  public static void main(String[] args)
  {

    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    insertionSortRecursive(intArray, intArray.length);

    Helpers.printArray(intArray);

  }

  /*
   * input is the array to be sorted
   * n is the number of elements we want to sort within the array from the start of the array
   * we assume the first item in the array { 20 } is already sorted
   */
  public static void insertionSortRecursive(int[] input, int n)
  {
//    base case because 1 item is sorted
    if (n <= 1) return;

//    sort first n-1 elements
    insertionSortRecursive(input, n - 1);

//    insert last element at  its correct position in sorted array
    int last = input[n - 1];
    int j = n - 2;

//    move elements of input[0 ... i-1], that are greater than key,
//    to one position ahead of their current position
    while (j >= 0 && input[j] > last)
    {
      input[j + 1] = input[j];
      j--;
    }

    input[j + 1] = last;
  }

}
