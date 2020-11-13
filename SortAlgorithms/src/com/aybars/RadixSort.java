package com.aybars;

public class RadixSort
{
  public static void main(String[] args)
  {
    int[] input = {4725, 4586, 1330, 8792, 1594, 5729, 12};

    radixSort(input, 10, 4);

    Helpers.printArray(input);
  }

  /*
  Radix Sort
   */
  public static void radixSort(int[] input, int radix, int width)
  {
    for (int i = 0; i < width; i++)
    {
      radixSingleSort(input, i, radix);
    }
  }


  /*
  Radix single sort
   */
  public static void radixSingleSort(int[] input, int position, int radix)
  {
    int numItems = input.length;

//    for digits we will have a count array of length 10
    int[] countArray = new int[radix];

    for (int value : input)
    {
      countArray[getDigit(position, value, radix)]++;
    }

//    adjusting our count array to values and less
    for (int j = 1; j < radix; j++)
    {
      countArray[j] += countArray[j - 1];
    }

//    copy the values to a temp array to preserve the positions
    int[] temp = new int[numItems];
    for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
    {
      temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
    }

//    write back to the array to the input array
    for (int tempIndex = 0; tempIndex < numItems; tempIndex++)
    {
      input[tempIndex] = temp[tempIndex];
    }
  }

  public static int getDigit(int position, int value, int radix)
  {
//    getting the digit at a position -- i.e 1348 -> 4 is returned for 10s which is position 1
    return value / (int) Math.pow(radix, position) % radix;
  }
}
