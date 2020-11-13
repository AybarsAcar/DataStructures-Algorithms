package com.aybars;

public class QuickSort
{

  public static void main(String[] args)
  {

    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    quickSort(intArray, 0, intArray.length);

    Helpers.printArray(intArray);

  }

  public static void quickSort(int[] input, int start, int end)
  {
//    1 element array
    if (end - start < 2) return;

//    returns the correct sorted position
    int pivotIndex = partition(input, start, end);

    quickSort(input, start, pivotIndex);
    quickSort(input, pivotIndex + 1, end);

  }

  /*
    returns the correct position of the pivot within the array
    using the first element as the pivot
   */
  public static int partition(int[] input, int start, int end)
  {
    int pivot = input[start];
    int i = start;
    int j = end;

//    traversal
    while (i < j)
    {
//      empty loop to decrement a j until find an elmeent less than the pivor or j crosses i
      while (i < j && input[--j] >= pivot) ;
      if (i < j) input[i] = input[j];

//      move the ones larger to the right side
      while (i < j && input[++i] <= pivot) ;
      if (i < j) input[j] = input[i];
    }

//    now the value of j is where we want to insert the pivot
    input[j] = pivot;
    return j;
  }
}
