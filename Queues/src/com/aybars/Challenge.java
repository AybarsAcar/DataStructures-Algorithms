package com.aybars;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class Challenge
{
  public static void main(String[] args)
  {

  }

  /*
  isPalindrome challenge using a stack and a queue
  assume lowercase inputs
  anything other than a-z is ignored
   * Steps:
    - push the chars in a queue
    - push the chars in a stack
    - then remove them into a string see if they are equal
   */
  public boolean isPalindrome(String input)
  {
    LinkedList<Character> stack = new LinkedList<>();
    LinkedList<Character> queue = new LinkedList<>();
    String lowerCase = input.toLowerCase();

    for (int i = 0; i < lowerCase.length(); i++)
    {
      char c = lowerCase.charAt(i);

      if (c >= 'a' && c <= 'z')
      {
        queue.addLast(c);
        stack.push(c);
      }
    }

    while (!stack.isEmpty())
    {
      if (!stack.pop().equals(queue.removeFirst()))
      {
        return false;
      }
    }
    
    return true;
  }
}
