package com.aybars;

public class SelectionSort
{

  public static void main(String[] args)
  {

    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
    {

      int largestElementPosition = 0;

      for (int i = 1; i <= lastUnsortedIndex; i++)
      {

        if (intArray[i] > intArray[largestElementPosition])
        {
          largestElementPosition = i;
        }

        Helpers.swap(intArray, largestElementPosition, lastUnsortedIndex);

      }

    }

    Helpers.printArray(intArray);
  }
}
