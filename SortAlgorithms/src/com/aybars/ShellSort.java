package com.aybars;

public class ShellSort
{

  public static void main(String[] args)
  {

    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//    initialise the gap value and reduce it
    for (int gap = intArray.length / 2; gap > 0; gap /= 2)
    {

//      actual comparing and shifting
      for (int i = gap; i < intArray.length; i++)
      {

        int newElement = intArray[i];

        int j = i;

        while (j >= gap && intArray[j - gap] > newElement)
        {
//          shift hte element
          intArray[j] = intArray[j - gap];
          j -= gap;
        }

        intArray[j] = newElement;

      }

    }

    Helpers.printArray(intArray);
  }
}
