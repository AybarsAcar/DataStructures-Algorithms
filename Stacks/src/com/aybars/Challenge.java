package com.aybars;

import java.util.LinkedList;

/*
isPalindrome challenge using a Stack
racecar is a palindrome, hello is not
punctuation is ignored
Stack is ideal for reversing the string
 */
public class Challenge
{
  public static void main(String[] args)
  {
    System.out.println(isPalindrome("hello"));
    System.out.println(isPalindrome("abba"));
    System.out.println(isPalindrome("hello ol? leh!!2"));

  }

  /*
  using Stack -> great option
   */
  public static boolean isPalindrome(String string)
  {
    LinkedList<Character> stack = new LinkedList<>();
    StringBuilder stringNoPunctuation = new StringBuilder(string.length());
    String lowerCase = string.toLowerCase();

    for (int i = 0; i < lowerCase.length(); i++)
    {
      char c = lowerCase.charAt(i);

      if (c >= 'a' && c <= 'z')
      {
        stringNoPunctuation.append(c);
        stack.push(c);
      }
    }

//    create the reverse string
    StringBuilder reversedString = new StringBuilder(stack.size());

     while (!stack.isEmpty())
     {
       reversedString.append(stack.pop());
     }

     return stringNoPunctuation.toString().equals(reversedString.toString());
  }
}
