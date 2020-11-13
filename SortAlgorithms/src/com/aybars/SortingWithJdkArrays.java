package com.aybars;

import java.util.Arrays;

public class SortingWithJdkArrays
{
  public static void main(String[] args)
  {
    int[] input = {4725, 4586, 1330, 8792, 1594, 5729, 12};

//    Arrays.sort(input);

    Arrays.parallelSort(input);

    Helpers.printArray(input);
  }
}
