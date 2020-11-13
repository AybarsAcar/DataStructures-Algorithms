package com.aybars;

import java.util.Arrays;

public class Main
{

  /*
  Bubble sorting
   */
  public static void main(String[] args)
  {

    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//    bubble sort
    for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
    {

      for (int i = 0; i < lastUnsortedIndex; i++)
      {
        if (intArray[i] > intArray[i + 1])
        {
          Helpers.swap(intArray, i, i + 1);
        }
      }

    }

    for (int i : intArray)
    {
      System.out.println(i);
    }
  }
}
