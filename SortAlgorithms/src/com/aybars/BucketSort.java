package com.aybars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
hash tables are used in this sorting algorithm
 */
public class BucketSort
{
  public static void main(String[] args)
  {
    int[] intArray = {54, 46, 83, 66, 95, 92, 43};

    bucketSort(intArray);

    Helpers.printArray(intArray);
  }

  public static void bucketSort(int[] input)
  {
    List<Integer>[] buckets = new List[10];

    for (int i = 0; i < buckets.length; i++)
    {
      buckets[i] = new ArrayList<>();
    }

    for (int i = 0; i < input.length; i++)
    {
//      scattering phase
      buckets[hash(input[i])].add(input[i]);
    }

//    sort each bucket
    for (List<Integer> bucket : buckets)
    {
      Collections.sort(bucket);
    }

    int j = 0;
    for (int i = 0; i < buckets.length; i++)
    {
      for (int value : buckets[i])
      {
        input[j++] = value;
      }
    }
  }

  private static int hash(int value)
  {
    return value / 10 % 10;
  }

}
