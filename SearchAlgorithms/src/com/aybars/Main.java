package com.aybars;

import java.util.Arrays;

public class Main
{

  public static void main(String[] args)
  {
    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    System.out.println(linearSearch(intArray, 35));
    System.out.println(linearSearch(intArray, 1480));

//    sorted int array -- for binary search
    int[] intArray2 = Arrays.stream(intArray).sorted().toArray();

    System.out.println(iterativeBinarySearch(intArray2, 20));
    System.out.println(recursiveBinarySearch(intArray2, 20));
    System.out.println(recursiveBinarySearch(intArray2, 1938));

  }

  public static int linearSearch(int[] input, int value)
  {
    for (int i = 0; i < input.length; i++)
    {
      if (input[i] == value)
      {
        return i;
      }
    }

    return -1;
  }

  public static int iterativeBinarySearch(int[] input, int value)
  {
    int start = 0;
    int end = input.length;

    while (start < end)
    {
      int midpoint = (start + end) / 2;

      if (input[midpoint] == value)
      {
        return midpoint;
      } else if (input[midpoint] < value)
      {
//        search the right part of the array
        start = midpoint + 1;
      } else
      {
//        search the left part of the array
        end = midpoint;
      }
    }

    return -1;
  }

  public static int recursiveBinarySearch(int[] input, int value)
  {
    return recursiveBinarySearch(input, 0, input.length, value);
  }

  public static int recursiveBinarySearch(int[] input, int start, int end, int value)
  {
    if (start >= end)
    {
      return -1;
    }

    int midpoint = (start + end) / 2;

    if (input[midpoint] == value) return midpoint;

    if (input[midpoint] < value)
    {
      return recursiveBinarySearch(input, midpoint + 1, end, value);
    } else
    {
      return recursiveBinarySearch(input, start, midpoint, value);
    }
  }
}
