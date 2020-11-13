package com.aybars;

public class Challenge3
{
  /*
   * Radix sort to sort strings -- overload the methods
   * Assumption: All values are lowercase
   */
  public static void main(String[] args)
  {
    String[] input = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

    radixSort(input, 26, 5);

    for (String value : input)
    {
      System.out.println(value);
    }
  }

  /*
  Radix Sort
   */
  public static void radixSort(String[] input, int radix, int width)
  {
    for (int i = width - 1; i >= 0; i--)
    {
      radixSingleSort(input, i, radix);
    }
  }

  /*
  Radix single sort
   */
  public static void radixSingleSort(String[] input, int position, int radix)
  {
    int numItems = input.length;

//    for digits we will have a count array of length 10
    int[] countArray = new int[radix];

    for (String value : input)
    {
      countArray[getIndex(position, value)]++;
    }

//    adjusting our count array to values and less
    for (int j = 1; j < radix; j++)
    {
      countArray[j] += countArray[j - 1];
    }

//    copy the values to a temp array to preserve the positions
    String[] temp = new String[numItems];
    for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
    {
      temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
    }

//    write back to the array to the input array
    for (int tempIndex = 0; tempIndex < numItems; tempIndex++)
    {
      input[tempIndex] = temp[tempIndex];
    }
  }

//  a has an ascii value of 96 -> to position 0, characters are numeric values in ASCII
  public static int getIndex(int position, String value)
  {
//    converting the positions to 0 indexed positions
    return value.charAt(position) - 'a';
  }
}
