package com.aybars;

/*
write a hashing function to add the integers into an array
 */
public class Challenge1
{
  public static void main(String[] args)
  {
    int[] nums = new int[10];
    int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};

    for (int i = 0; i < numsToAdd.length; i++)
    {
      nums[hash(numsToAdd[i])] = numsToAdd[i];
    }

    for (int num : nums)
    {
      System.out.println(num);
    }
  }

  public static int hash(int input)
  {
    return Math.abs(input % 10);
  }
}
