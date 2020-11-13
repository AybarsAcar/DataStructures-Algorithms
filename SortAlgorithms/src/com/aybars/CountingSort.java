package com.aybars;

public class CountingSort
{
  public static void main(String[] args)
  {

    int[] intArray = {20, 7, 15, 7, 20, 1, 7, 3, 5, 4, 15};

    countingSort(intArray, 1, 20);

    Helpers.printArray(intArray);
  }

  public static void countingSort(int[] input, int min, int max)
  {
    int[] countArray = new int[(max - min) + 1];

    for (int i = 0; i < input.length; i++)
    {
      countArray[input[i] - min]++;
    }

//    now write back the values
    int j = 0;
    for (int i = min; i <= max; i++)
    {
      while (countArray[i - min] > 0)
      {
        input[j++] = i;
        countArray[i - min]--;
      }
    }
  }
}
