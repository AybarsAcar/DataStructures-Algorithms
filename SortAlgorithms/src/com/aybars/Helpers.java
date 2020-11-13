package com.aybars;

public class Helpers
{

  //    swapping method -- array and 2 indices
  public static void swap(int[] array, int i, int j)
  {
    if (i == j)
    {
      return;
    }

    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;

  }

  public static void printArray(int[] array)
  {
    for (int i : array)
    {
      System.out.println(i);
    }
  }

}
