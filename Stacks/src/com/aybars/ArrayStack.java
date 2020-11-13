package com.aybars;

import java.util.EmptyStackException;

/*
Stack implementation
using a backing array
 */
public class ArrayStack
{
  private Employee[] stack;
  private int top;

  public ArrayStack(int capacity)
  {
    stack = new Employee[capacity];
  }

  public void push(Employee employee)
  {
    if (top == stack.length)
    {
//      then the stack is full -- its out of bounds so resize the backing array
      Employee[] newArray = new Employee[2 * stack.length];
      System.arraycopy(stack, 0, newArray, 0, stack.length);
      stack = newArray;
    }

    stack[top++] = employee;
  }

  //  we could consider resizing the array if there is too much empty space
//  it would be diligent to resize the array if the empty space is too much
  public Employee pop()
  {
    if (isEmpty()) throw new EmptyStackException();

//    decrement top
    Employee employee = stack[--top];
    stack[top] = null;

    return employee;
  }

  public Employee peak()
  {
    if (isEmpty()) throw new EmptyStackException();

    return stack[top - 1];
  }

  public int size()
  {
    return top;
  }

  public boolean isEmpty()
  {
    return top == 0;
  }

  public void printStack()
  {
    for (int i = top - 1; i >= 0; i--)
    {
      System.out.println(stack[i]);
    }
  }
}
