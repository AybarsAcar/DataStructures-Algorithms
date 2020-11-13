package com.aybars;

public class InsertionSort
{

  public static void main(String[] args)
  {

    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
    {

      int newElement = intArray[firstUnsortedIndex];

      int i;

//      look for the correct insertion position
//      comparisons are from left to right
      for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--)
      {
//        shifting
        intArray[i] = intArray[i - 1];
      }

      intArray[i] = newElement;
    }

    Helpers.printArray(intArray);

  }

}
