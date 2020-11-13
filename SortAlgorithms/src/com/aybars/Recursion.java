package com.aybars;

public class Recursion
{

  public static void main(String[] args)
  {

    System.out.println(iterativeFactorial(5));
    System.out.println(recursiveFactorial(5));

  }

  public static int iterativeFactorial(int num)
  {
    if (num == 0) return 1;

    int factorial = 1;
    for (int i = 1; i <= num; i++)
    {
      factorial = factorial * i;
    }

    return factorial;
  }

  public static int recursiveFactorial(int num)
  {
    if (num == 0) return 1;

    return num * recursiveFactorial(num - 1);
  }
}